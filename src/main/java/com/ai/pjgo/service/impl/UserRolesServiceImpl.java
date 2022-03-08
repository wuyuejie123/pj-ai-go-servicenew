package com.ai.pjgo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ai.pjgo.common.utils.PageUtils;
import com.ai.pjgo.common.utils.Query;

import com.ai.pjgo.dao.UserRolesDao;
import com.ai.pjgo.entity.UserRolesEntity;
import com.ai.pjgo.service.UserRolesService;


@Service("userRolesService")
public class UserRolesServiceImpl extends ServiceImpl<UserRolesDao, UserRolesEntity> implements UserRolesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserRolesEntity> page = this.page(
                new Query<UserRolesEntity>().getPage(params),
                new QueryWrapper<UserRolesEntity>()
        );

        return new PageUtils(page);
    }

}