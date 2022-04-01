package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.Admin;
import com.zhangyu.server.pojo.Menu;
import com.zhangyu.server.service.MenuService;
import com.zhangyu.server.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangyu
 * @description 针对表【t_menu】的数据库操作Service实现
 * @createDate 2022-03-07 21:17:10
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
        implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 通过用户id查询菜单列表
     *
     * @return
     */
    @Override
    public List<Menu> getMenusByAdminId() {
        return menuMapper.getMenusByAdminId(((Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}




