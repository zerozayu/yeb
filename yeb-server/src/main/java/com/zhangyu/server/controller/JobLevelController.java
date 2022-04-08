package com.zhangyu.server.controller;

import com.zhangyu.server.pojo.Joblevel;
import com.zhangyu.server.pojo.RespBean;
import com.zhangyu.server.service.JoblevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * 职称管理
 *
 * @author zhangyu
 * @date 2022/4/6 17:20
 */
@Api(tags = "JobLevelController")
@RestController
@RequestMapping("/system/basic/joblevel")
public class JobLevelController {
    @Autowired
    private JoblevelService joblevelService;

    @ApiOperation(value = "获取所有职称信息")
    @GetMapping("/")
    public List<Joblevel> getAllJobLevels(){
        return joblevelService.list();
    }

    @ApiOperation(value = "新增职称信息")
    @PostMapping("/")
    public RespBean addJobLevel(@RequestBody Joblevel joblevel){
        joblevel.setCreatedate(LocalDateTime.now());
        if (joblevelService.save(joblevel)){
            return RespBean.success("新增职称信息成功");
        }
        return RespBean.error("新增职称消息失败");
    }

    @ApiOperation(value = "修改职称信息")
    @PutMapping("/")
    public RespBean updateJobLevel(@RequestBody Joblevel joblevel){
        if (joblevelService.updateById(joblevel)){
            return RespBean.success("修改职称信息成功");
        }
        return RespBean.error("修改职称信息失败");
    }

    @ApiOperation(value = "删除职称信息")
    @DeleteMapping("/{id}")
    public RespBean deleteJobLevel(@PathVariable Integer id){
        if (joblevelService.removeById(id)){
            return RespBean.success("删除职称信息成功");
        }
        return RespBean.error("删除职称信息失败");
    }

    @ApiOperation(value = "批量删除职称信息")
    @DeleteMapping("/")
    public RespBean deletePositionByIds(@RequestParam Integer[] ids){
        if (joblevelService.removeByIds(Arrays.asList(ids))){
            return RespBean.success("批量删除职称信息成功");
        }
        return RespBean.error("批量删除职称信息失败");
    }

}
