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

import com.ai.pjgo.entity.UserInfoEntity;
import com.ai.pjgo.service.UserInfoService;
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
@RequestMapping("pjgo/userinfo")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pjgo:userinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{userId}")
   // @RequiresPermissions("pjgo:userinfo:info")
    public R info(@PathVariable("userId") Integer userId){
		UserInfoEntity userInfo = userInfoService.getById(userId);

        return R.ok().put("userInfo", userInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pjgo:userinfo:save")
    public R save(@RequestBody UserInfoEntity userInfo){
		userInfoService.save(userInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pjgo:userinfo:update")
    public R update(@RequestBody UserInfoEntity userInfo){
		userInfoService.updateById(userInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pjgo:userinfo:delete")
    public R delete(@RequestBody Integer[] userIds){
		userInfoService.removeByIds(Arrays.asList(userIds));

        return R.ok();
    }

}
