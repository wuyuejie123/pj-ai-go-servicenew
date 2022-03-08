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

import com.ai.pjgo.entity.DeviceSensorEntity;
import com.ai.pjgo.service.DeviceSensorService;
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
@RequestMapping("pjgo/devicesensor")
public class DeviceSensorController {
    @Autowired
    private DeviceSensorService deviceSensorService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pjgo:devicesensor:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = deviceSensorService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{sensorId}")
   // @RequiresPermissions("pjgo:devicesensor:info")
    public R info(@PathVariable("sensorId") Integer sensorId){
		DeviceSensorEntity deviceSensor = deviceSensorService.getById(sensorId);

        return R.ok().put("deviceSensor", deviceSensor);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pjgo:devicesensor:save")
    public R save(@RequestBody DeviceSensorEntity deviceSensor){
		deviceSensorService.save(deviceSensor);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pjgo:devicesensor:update")
    public R update(@RequestBody DeviceSensorEntity deviceSensor){
		deviceSensorService.updateById(deviceSensor);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pjgo:devicesensor:delete")
    public R delete(@RequestBody Integer[] sensorIds){
		deviceSensorService.removeByIds(Arrays.asList(sensorIds));

        return R.ok();
    }

}
