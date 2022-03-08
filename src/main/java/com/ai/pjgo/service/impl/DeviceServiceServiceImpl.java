package com.ai.pjgo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.Query;

import com.ai.pjgo.dao.DeviceServiceDao;
import com.ai.pjgo.entity.DeviceServiceEntity;
import com.ai.pjgo.service.DeviceServiceService;


@Service("deviceServiceService")
public class DeviceServiceServiceImpl extends ServiceImpl<DeviceServiceDao, DeviceServiceEntity> implements DeviceServiceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeviceServiceEntity> page = this.page(
                new Query<DeviceServiceEntity>().getPage(params),
                new QueryWrapper<DeviceServiceEntity>()
        );

        return new PageUtils(page);
    }

}