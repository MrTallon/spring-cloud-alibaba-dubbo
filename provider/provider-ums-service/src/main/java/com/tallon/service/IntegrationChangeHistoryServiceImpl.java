package com.tallon.service;

import com.tallon.domain.IntegrationChangeHistory;
import com.tallon.mapper.IntegrationChangeHistoryMapper;
import api.IntegrationChangeHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 积分变化历史记录表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryMapper, IntegrationChangeHistory> implements IntegrationChangeHistoryService {

}
