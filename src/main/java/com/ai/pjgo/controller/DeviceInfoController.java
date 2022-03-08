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

import com.ai.pjgo.entity.DeviceInfoEntity;
import com.ai.pjgo.service.DeviceInfoService;
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
@RequestMapping("pjgo/deviceinfo")
public class DeviceInfoController {
    @Autowired
    private DeviceInfoService deviceInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pjgo:deviceinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = deviceInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{deviceId}")
   // @RequiresPermissions("pjgo:deviceinfo:info")
    public R info(@PathVariable("deviceId") Integer deviceId){
		DeviceInfoEntity deviceInfo = deviceInfoService.getById(deviceId);

        return R.ok().put("deviceInfo", deviceInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pjgo:deviceinfo:save")
    public R save(@RequestBody DeviceInfoEntity deviceInfo){
		deviceInfoService.save(deviceInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pjgo:deviceinfo:update")
    public R update(@RequestBody DeviceInfoEntity deviceInfo){
		deviceInfoService.updateById(deviceInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pjgo:deviceinfo:delete")
    public R delete(@RequestBody Integer[] deviceIds){
		deviceInfoService.removeByIds(Arrays.asList(deviceIds));

        return R.ok();
    }

}
