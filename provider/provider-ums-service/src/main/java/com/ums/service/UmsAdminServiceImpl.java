package com.ums.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsAdminService;
import com.ums.domain.UmsAdmin;
import com.ums.mapper.UmsAdminMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminMapper, UmsAdmin> implements UmsAdminService {

    @Resource
    private UmsAdminMapper umsAdminMapper;

    @Override
    public UmsAdmin getByName(String username) {

        return umsAdminMapper.selectOne(new QueryWrapper<>(new UmsAdmin().setUsername(username)));

    }
}
