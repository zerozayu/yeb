package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.PoliticsStatus;
import com.zhangyu.server.service.PoliticsStatusService;
import com.zhangyu.server.mapper.PoliticsStatusMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_politics_status】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class PoliticsStatusServiceImpl extends ServiceImpl<PoliticsStatusMapper, PoliticsStatus>
    implements PoliticsStatusService{

}




