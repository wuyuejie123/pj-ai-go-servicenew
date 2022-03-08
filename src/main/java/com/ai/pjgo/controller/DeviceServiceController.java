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

import com.ai.pjgo.entity.DeviceServiceEntity;
import com.ai.pjgo.service.DeviceServiceService;
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
@RequestMapping("pjgo/deviceservice")
public class DeviceServiceController {
    @Autowired
    private DeviceServiceService deviceServiceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pjgo:deviceservice:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = deviceServiceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{serviceId}")
   // @RequiresPermissions("pjgo:deviceservice:info")
    public R info(@PathVariable("serviceId") Integer serviceId){
		DeviceServiceEntity deviceService = deviceServiceService.getById(serviceId);

        return R.ok().put("deviceService", deviceService);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pjgo:deviceservice:save")
    public R save(@RequestBody DeviceServiceEntity deviceService){
		deviceServiceService.save(deviceService);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pjgo:deviceservice:update")
    public R update(@RequestBody DeviceServiceEntity deviceService){
		deviceServiceService.updateById(deviceService);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pjgo:deviceservice:delete")
    public R delete(@RequestBody Integer[] serviceIds){
		deviceServiceService.removeByIds(Arrays.asList(serviceIds));

        return R.ok();
    }

}
