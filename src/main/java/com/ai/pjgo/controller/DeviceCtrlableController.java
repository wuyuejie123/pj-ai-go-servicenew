package com.ai.pjgo.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ai.pjgo.entity.DeviceCtrlableEntity;
import com.ai.pjgo.service.DeviceCtrlableService;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.R;



/**
 * 
 *
 * @author lao_He_and_lao_Wu
 * @email 180054421@qq.com;1679737434@qq.com
 * @date 2022-03-08 13:45:38
 */
@RestController
@RequestMapping("pjgo/devicectrlable")
public class DeviceCtrlableController {
    @Autowired
    private DeviceCtrlableService deviceCtrlableService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pjgo:devicectrlable:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = deviceCtrlableService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{ctrlableId}")
   // @RequiresPermissions("pjgo:devicectrlable:info")
    public R info(@PathVariable("ctrlableId") Integer ctrlableId){
		DeviceCtrlableEntity deviceCtrlable = deviceCtrlableService.getById(ctrlableId);

        return R.ok().put("deviceCtrlable", deviceCtrlable);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pjgo:devicectrlable:save")
    public R save(@RequestBody DeviceCtrlableEntity deviceCtrlable){
		deviceCtrlableService.save(deviceCtrlable);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pjgo:devicectrlable:update")
    public R update(@RequestBody DeviceCtrlableEntity deviceCtrlable){
		deviceCtrlableService.updateById(deviceCtrlable);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pjgo:devicectrlable:delete")
    public R delete(@RequestBody Integer[] ctrlableIds){
		deviceCtrlableService.removeByIds(Arrays.asList(ctrlableIds));

        return R.ok();
    }

}
