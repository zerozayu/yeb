package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.MailLog;
import com.zhangyu.server.service.MailLogService;
import com.zhangyu.server.mapper.MailLogMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_mail_log】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog>
    implements MailLogService{

}




