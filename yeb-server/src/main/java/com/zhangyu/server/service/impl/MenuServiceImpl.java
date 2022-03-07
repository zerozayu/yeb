package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.Menu;
import com.zhangyu.server.service.MenuService;
import com.zhangyu.server.mapper.MenuMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_menu】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
    implements MenuService{

}




