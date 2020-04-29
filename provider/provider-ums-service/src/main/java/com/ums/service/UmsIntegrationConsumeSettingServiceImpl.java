package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsIntegrationConsumeSettingService;
import com.ums.domain.UmsIntegrationConsumeSetting;
import com.ums.mapper.UmsIntegrationConsumeSettingMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 积分消费设置 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsIntegrationConsumeSettingServiceImpl extends ServiceImpl<UmsIntegrationConsumeSettingMapper, UmsIntegrationConsumeSetting> implements UmsIntegrationConsumeSettingService {

}
