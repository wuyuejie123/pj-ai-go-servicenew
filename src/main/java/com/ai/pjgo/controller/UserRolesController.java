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

import com.ai.pjgo.entity.UserRolesEntity;
import com.ai.pjgo.service.UserRolesService;
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
@RequestMapping("pjgo/userroles")
public class UserRolesController {
    @Autowired
    private UserRolesService userRolesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pjgo:userroles:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userRolesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("pjgo:userroles:info")
    public R info(@PathVariable("id") Integer id){
		UserRolesEntity userRoles = userRolesService.getById(id);

        return R.ok().put("userRoles", userRoles);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pjgo:userroles:save")
    public R save(@RequestBody UserRolesEntity userRoles){
		userRolesService.save(userRoles);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pjgo:userroles:update")
    public R update(@RequestBody UserRolesEntity userRoles){
		userRolesService.updateById(userRoles);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pjgo:userroles:delete")
    public R delete(@RequestBody Integer[] ids){
		userRolesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
