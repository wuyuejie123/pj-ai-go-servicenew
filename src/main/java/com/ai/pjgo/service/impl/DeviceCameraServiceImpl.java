package com.ai.pjgo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.Query;

import com.ai.pjgo.dao.DeviceCameraDao;
import com.ai.pjgo.entity.DeviceCameraEntity;
import com.ai.pjgo.service.DeviceCameraService;


@Service("deviceCameraService")
public class DeviceCameraServiceImpl extends ServiceImpl<DeviceCameraDao, DeviceCameraEntity> implements DeviceCameraService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeviceCameraEntity> page = this.page(
                new Query<DeviceCameraEntity>().getPage(params),
                new QueryWrapper<DeviceCameraEntity>()
        );

        return new PageUtils(page);
    }

}