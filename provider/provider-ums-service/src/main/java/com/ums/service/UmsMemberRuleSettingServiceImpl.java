package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsMemberRuleSettingService;
import com.ums.domain.UmsMemberRuleSetting;
import com.ums.mapper.UmsMemberRuleSettingMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员积分成长规则表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsMemberRuleSettingServiceImpl extends ServiceImpl<UmsMemberRuleSettingMapper, UmsMemberRuleSetting> implements UmsMemberRuleSettingService {

}
