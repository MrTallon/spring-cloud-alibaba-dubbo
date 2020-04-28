package com.tallon.service;

import com.tallon.domain.MemberRuleSetting;
import com.tallon.mapper.MemberRuleSettingMapper;
import api.MemberRuleSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员积分成长规则表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class MemberRuleSettingServiceImpl extends ServiceImpl<MemberRuleSettingMapper, MemberRuleSetting> implements MemberRuleSettingService {

}
