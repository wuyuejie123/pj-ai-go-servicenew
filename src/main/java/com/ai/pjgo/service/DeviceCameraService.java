package com.ai.pjgo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.entity.DeviceCameraEntity;

import java.util.Map;

/**
 * 
 *
 * @author lao_He_and_lao_Wu
 * @email 180054421@qq.com;1679737434@qq.com
 * @date 2022-03-08 13:45:38
 */
public interface DeviceCameraService extends IService<DeviceCameraEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

