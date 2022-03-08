package com.ai.pjgo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.Query;

import com.ai.pjgo.dao.PhotoDao;
import com.ai.pjgo.entity.PhotoEntity;
import com.ai.pjgo.service.PhotoService;


@Service("photoService")
public class PhotoServiceImpl extends ServiceImpl<PhotoDao, PhotoEntity> implements PhotoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PhotoEntity> page = this.page(
                new Query<PhotoEntity>().getPage(params),
                new QueryWrapper<PhotoEntity>()
        );

        return new PageUtils(page);
    }

}