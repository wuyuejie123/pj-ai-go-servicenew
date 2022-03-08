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

import com.ai.pjgo.entity.PhotoEntity;
import com.ai.pjgo.service.PhotoService;
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
@RequestMapping("pjgo/photo")
public class PhotoController {
    @Autowired
    private PhotoService photoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pjgo:photo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = photoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{photoId}")
   // @RequiresPermissions("pjgo:photo:info")
    public R info(@PathVariable("photoId") Integer photoId){
		PhotoEntity photo = photoService.getById(photoId);

        return R.ok().put("photo", photo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pjgo:photo:save")
    public R save(@RequestBody PhotoEntity photo){
		photoService.save(photo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pjgo:photo:update")
    public R update(@RequestBody PhotoEntity photo){
		photoService.updateById(photo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pjgo:photo:delete")
    public R delete(@RequestBody Integer[] photoIds){
		photoService.removeByIds(Arrays.asList(photoIds));

        return R.ok();
    }

}
