package com.ai.pjgo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.Query;

import com.ai.pjgo.dao.RolePermissionDao;
import com.ai.pjgo.entity.RolePermissionEntity;
import com.ai.pjgo.service.RolePermissionService;


@Service("rolePermissionService")
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionDao, RolePermissionEntity> implements RolePermissionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RolePermissionEntity> page = this.page(
                new Query<RolePermissionEntity>().getPage(params),
                new QueryWrapper<RolePermissionEntity>()
        );

        return new PageUtils(page);
    }

}