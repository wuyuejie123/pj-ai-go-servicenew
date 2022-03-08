package com.ai.pjgo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.Query;

import com.ai.pjgo.dao.VideoDao;
import com.ai.pjgo.entity.VideoEntity;
import com.ai.pjgo.service.VideoService;


@Service("videoService")
public class VideoServiceImpl extends ServiceImpl<VideoDao, VideoEntity> implements VideoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<VideoEntity> page = this.page(
                new Query<VideoEntity>().getPage(params),
                new QueryWrapper<VideoEntity>()
        );

        return new PageUtils(page);
    }

}