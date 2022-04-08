package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.Department;
import com.zhangyu.server.pojo.RespBean;
import com.zhangyu.server.service.DepartmentService;
import com.zhangyu.server.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author zhangyu
 * @description 针对表【t_department】的数据库操作Service实现
 * @createDate 2022-03-07 21:17:10
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
        implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 获取所有部门
     *
     * @return
     */
    @Override
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartments(-1);

    }

    /**
     * 添加部门
     *
     * @param dep
     * @return
     */
    @Override
    public RespBean addDep(Department dep) {
        dep.setEnabled(1);
        departmentMapper.addDep(dep);
        if (1 == dep.getResult()) {
            return RespBean.success("添加部门成功");
        }
        return RespBean.error("添加部门失败");
    }

    /**
     * 删除部门
     *
     * @param id
     * @return
     */
    @Override
    public RespBean deleteDep(Integer id) {
        Department dep = new Department();
        dep.setId(id);
        departmentMapper.deleteDep(dep);
        if (-2 == dep.getResult()){
            return RespBean.error("该部门下面还有子部门，删除失败");
        }
        if (-1 == dep.getResult()){
            return RespBean.error("该部门下面还有员工，删除失败");
        }
        if (1 == dep.getResult()) {
            return RespBean.success("删除部门成功");
        }
        return RespBean.error("删除部门失败");
    }
}




