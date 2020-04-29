package com.tallon.service;

import com.tallon.domain.Admin;
import com.tallon.mapper.AdminMapper;
import com.tallon.api.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
