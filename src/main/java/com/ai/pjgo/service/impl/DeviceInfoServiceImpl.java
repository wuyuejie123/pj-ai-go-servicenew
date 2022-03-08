package com.ai.pjgo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.Query;

import com.ai.pjgo.dao.DeviceInfoDao;
import com.ai.pjgo.entity.DeviceInfoEntity;
import com.ai.pjgo.service.DeviceInfoService;


@Service("deviceInfoService")
public class DeviceInfoServiceImpl extends ServiceImpl<DeviceInfoDao, DeviceInfoEntity> implements DeviceInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeviceInfoEntity> page = this.page(
                new Query<DeviceInfoEntity>().getPage(params),
                new QueryWrapper<DeviceInfoEntity>()
        );

        return new PageUtils(page);
    }

}