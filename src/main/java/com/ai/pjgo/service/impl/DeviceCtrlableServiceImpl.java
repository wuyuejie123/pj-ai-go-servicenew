package com.ai.pjgo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.Query;

import com.ai.pjgo.dao.DeviceCtrlableDao;
import com.ai.pjgo.entity.DeviceCtrlableEntity;
import com.ai.pjgo.service.DeviceCtrlableService;


@Service("deviceCtrlableService")
public class DeviceCtrlableServiceImpl extends ServiceImpl<DeviceCtrlableDao, DeviceCtrlableEntity> implements DeviceCtrlableService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeviceCtrlableEntity> page = this.page(
                new Query<DeviceCtrlableEntity>().getPage(params),
                new QueryWrapper<DeviceCtrlableEntity>()
        );

        return new PageUtils(page);
    }

}