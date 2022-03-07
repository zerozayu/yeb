package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.Position;
import com.zhangyu.server.service.PositionService;
import com.zhangyu.server.mapper.PositionMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_position】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position>
    implements PositionService{

}




