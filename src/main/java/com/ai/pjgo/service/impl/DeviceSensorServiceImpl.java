package com.ai.pjgo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.Query;

import com.ai.pjgo.dao.DeviceSensorDao;
import com.ai.pjgo.entity.DeviceSensorEntity;
import com.ai.pjgo.service.DeviceSensorService;


@Service("deviceSensorService")
public class DeviceSensorServiceImpl extends ServiceImpl<DeviceSensorDao, DeviceSensorEntity> implements DeviceSensorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeviceSensorEntity> page = this.page(
                new Query<DeviceSensorEntity>().getPage(params),
                new QueryWrapper<DeviceSensorEntity>()
        );

        return new PageUtils(page);
    }

}