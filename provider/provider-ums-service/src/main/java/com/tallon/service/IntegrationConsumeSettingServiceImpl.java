package com.tallon.service;

import com.tallon.domain.IntegrationConsumeSetting;
import com.tallon.mapper.IntegrationConsumeSettingMapper;
import com.tallon.api.IntegrationConsumeSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 积分消费设置 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class IntegrationConsumeSettingServiceImpl extends ServiceImpl<IntegrationConsumeSettingMapper, IntegrationConsumeSetting> implements IntegrationConsumeSettingService {

}
