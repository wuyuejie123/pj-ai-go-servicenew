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

import com.ai.pjgo.entity.RolesEntity;
import com.ai.pjgo.service.RolesService;
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
@RequestMapping("pjgo/roles")
public class RolesController {
    @Autowired
    private RolesService rolesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pjgo:roles:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = rolesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{roleId}")
   // @RequiresPermissions("pjgo:roles:info")
    public R info(@PathVariable("roleId") Integer roleId){
		RolesEntity roles = rolesService.getById(roleId);

        return R.ok().put("roles", roles);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pjgo:roles:save")
    public R save(@RequestBody RolesEntity roles){
		rolesService.save(roles);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pjgo:roles:update")
    public R update(@RequestBody RolesEntity roles){
		rolesService.updateById(roles);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pjgo:roles:delete")
    public R delete(@RequestBody Integer[] roleIds){
		rolesService.removeByIds(Arrays.asList(roleIds));

        return R.ok();
    }

}
