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

import com.ai.pjgo.entity.VideoEntity;
import com.ai.pjgo.service.VideoService;
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
@RequestMapping("pjgo/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("pjgo:video:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = videoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{videoId}")
   // @RequiresPermissions("pjgo:video:info")
    public R info(@PathVariable("videoId") Integer videoId){
		VideoEntity video = videoService.getById(videoId);

        return R.ok().put("video", video);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("pjgo:video:save")
    public R save(@RequestBody VideoEntity video){
		videoService.save(video);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("pjgo:video:update")
    public R update(@RequestBody VideoEntity video){
		videoService.updateById(video);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("pjgo:video:delete")
    public R delete(@RequestBody Integer[] videoIds){
		videoService.removeByIds(Arrays.asList(videoIds));

        return R.ok();
    }

}
