package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.mapper.EmployeeMapper;
import com.zhangyu.server.mapper.MailLogMapper;
import com.zhangyu.server.pojo.*;
import com.zhangyu.server.service.EmployeeService;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author zhangyu
 * @description 针对表【t_employee】的数据库操作Service实现
 * @createDate 2022-03-07 21:17:10
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
        implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private MailLogMapper mailLogMapper;

    /**
     * 获取所有员工信息（分页）
     *
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    @Override
    public RespPageBean getEmployeeByPage(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope) {
        // 开启分页
        Page<Employee> page = new Page<>(currentPage, size);
        IPage<Employee> employeeByPage = employeeMapper.getEmployeeByPage(page, employee, beginDateScope);
        return new RespPageBean(employeeByPage.getTotal(), employeeByPage.getRecords());
    }

    /**
     * 获取工号
     *
     * @return
     */
    @Override
    public RespBean getMaxWordId() {
        List<Map<String, Object>> mapList = employeeMapper.selectMaps(new QueryWrapper<Employee>().select("max(workId)"));
        return RespBean.success(null, String.format("%08d", Integer.parseInt(mapList.get(0).get("max(workId)").toString()) + 1));

    }

    /**
     * 添加员工
     *
     * @param employee
     * @return
     */
    @Override
    public RespBean addEmp(Employee employee) {
        // 处理合同期限，保留两位小数
        LocalDate begincontract = employee.getBegincontract();
        LocalDate endcontract = employee.getEndcontract();
        long days = begincontract.until(endcontract, ChronoUnit.DAYS);
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        employee.setContractterm(Double.parseDouble(decimalFormat.format(days / 365.00)));
        if (1 == employeeMapper.insert(employee)) {
            Employee emp = employeeMapper.getEmployee(employee.getId()).get(0);
            // 数据库记录发送的消息
            // String msgId = UUID.randomUUID().toString();
            String msgId = "123456";
            MailLog mailLog = new MailLog();
            mailLog.setMsgid(msgId);
            mailLog.setEid(employee.getId());
            mailLog.setStatus(0);
            mailLog.setRoutekey(MailConstants.MAIL_ROUTING_KEY_NAME);
            mailLog.setExchange(MailConstants.MAIL_EXCHANGE_NAME);
            mailLog.setCount(0);
            mailLog.setTrytime(LocalDateTime.now().plusMinutes(MailConstants.MSG_TIMEOUT));
            mailLog.setCreatetime(LocalDateTime.now());
            mailLog.setUpdatetime(LocalDateTime.now());
            mailLogMapper.insert(mailLog);
            // 发送信息
            rabbitTemplate.convertAndSend(MailConstants.MAIL_EXCHANGE_NAME, MailConstants.MAIL_ROUTING_KEY_NAME, emp, new CorrelationData(msgId));
            return RespBean.success("添加员工成功");
        }
        return RespBean.error("添加员工失败");
    }

    /**
     * 查询员工
     *
     * @param id
     * @return
     */
    @Override
    public List<Employee> getEmployee(Integer id) {
        return employeeMapper.getEmployee(id);
    }

}




