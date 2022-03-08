package com.ai.pjgo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.Query;

import com.ai.pjgo.dao.RolesDao;
import com.ai.pjgo.entity.RolesEntity;
import com.ai.pjgo.service.RolesService;


@Service("rolesService")
public class RolesServiceImpl extends ServiceImpl<RolesDao, RolesEntity> implements RolesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RolesEntity> page = this.page(
                new Query<RolesEntity>().getPage(params),
                new QueryWrapper<RolesEntity>()
        );

        return new PageUtils(page);
    }

}