package com.ums.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsAdminService;
import com.ums.domain.UmsAdmin;
import com.ums.mapper.UmsAdminMapper;
import com.ums.service.fallback.UmsAdminServiceFallback;
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
    @SentinelResource(value = "getByUserName",fallback = "getByUsernameFallback",fallbackClass = UmsAdminServiceFallback.class)
    public UmsAdmin getByName(String username) {
        return umsAdminMapper.selectOne(new QueryWrapper<>(new UmsAdmin().setUsername(username)));
    }

    @Override
    public boolean modifyPassword(String username, String newPassword) {

        int update = umsAdminMapper.update(
                new UmsAdmin().setPassword(newPassword), new QueryWrapper<>(new UmsAdmin().setUsername(username)));
        return update > 0;
    }

    @Override
    public boolean modifyIcon(String username, String path) {
        int update = umsAdminMapper.update(
                new UmsAdmin().setPassword(path), new QueryWrapper<>(new UmsAdmin().setUsername(username)));
        return update > 0;
    }
}
