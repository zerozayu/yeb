package com.zhangyu.server.controller;

import com.zhangyu.server.pojo.Position;
import com.zhangyu.server.pojo.RespBean;
import com.zhangyu.server.service.PositionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * 职位信息
 *
 * @author zhangyu
 * @date 2022/4/5 10:37
 */
@RestController
@RequestMapping("/system/cfg/pos")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @ApiOperation(value = "获取所有的职位信息")
    @GetMapping("/")
    public List<Position> getAllPositions(){
        return positionService.list();
    }

    @ApiOperation(value = "添加职位信息")
    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position){
        position.setCreatedate(LocalDateTime.now());
        if (positionService.save(position)){
            return RespBean.success("添加职位信息成功");
        }
        return RespBean.error("添加职位信息失败");
    }

    @ApiOperation(value = "更新职位信息")
    @PutMapping("/")
    public RespBean updatePosition(@RequestBody Position position){
        if (positionService.updateById(position)){
            return RespBean.success("更新职位信息成功");
        }
        return RespBean.error("更新职位信息失败");
    }

    @ApiOperation(value = "删除职位信息")
    @DeleteMapping("/{id}")
    public RespBean deletePosition(@PathVariable Integer id){
        if (positionService.removeById(id)){
            return RespBean.success("删除职位信息成功");
        }
        return RespBean.error("删除职位信息失败");
    }

    @ApiOperation(value = "批量删除职位信息")
    @DeleteMapping("/")
    public RespBean deletePositionByIds(Integer[] ids){
        if (positionService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("批量删除职位信息成功");
        }
        return RespBean.error("批量删除职位信息失败");
    }
}
