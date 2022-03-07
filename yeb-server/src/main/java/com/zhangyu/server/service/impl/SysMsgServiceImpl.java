package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.SysMsg;
import com.zhangyu.server.service.SysMsgService;
import com.zhangyu.server.mapper.SysMsgMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_sys_msg】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class SysMsgServiceImpl extends ServiceImpl<SysMsgMapper, SysMsg>
    implements SysMsgService{

}




