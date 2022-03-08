package com.ai.pjgo.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;

import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ai.pjgo.entity.DeviceCameraEntity;
import com.ai.pjgo.service.DeviceCameraService;




/**
 * 
 *
 * @author lao_He_and_lao_Wu
 * @email 180054421@qq.com;1679737434@qq.com
 * @date 2022-03-08 13:45:38
 */
@RestController
@RequestMapping("pjgo/devicecamera")
public class DeviceCameraController {
    @Autowired
    private DeviceCameraService deviceCameraService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pjgo:devicecamera:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = deviceCameraService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{cameraId}")
   // @RequiresPermissions("pjgo:devicecamera:info")
    public R info(@PathVariable("cameraId") Integer cameraId){
		DeviceCameraEntity deviceCamera = deviceCameraService.getById(cameraId);

        return R.ok().put("deviceCamera", deviceCamera);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pjgo:devicecamera:save")
    public R save(@RequestBody DeviceCameraEntity deviceCamera){
		deviceCameraService.save(deviceCamera);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pjgo:devicecamera:update")
    public R update(@RequestBody DeviceCameraEntity deviceCamera){
		deviceCameraService.updateById(deviceCamera);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pjgo:devicecamera:delete")
    public R delete(@RequestBody Integer[] cameraIds){
		deviceCameraService.removeByIds(Arrays.asList(cameraIds));

        return R.ok();
    }

}
