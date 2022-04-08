package com.zhangyu.server.mapper;

import com.zhangyu.server.pojo.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author zhangyu
* @description 针对表【t_admin】的数据库操作Mapper
* @createDate 2022-03-07 21:17:10
* @Entity com.zhangyu.server.pojo.Admin
*/
public interface AdminMapper extends BaseMapper<Admin> {

    List<Admin> getAllAdmin(Integer id, String keywords);
}




