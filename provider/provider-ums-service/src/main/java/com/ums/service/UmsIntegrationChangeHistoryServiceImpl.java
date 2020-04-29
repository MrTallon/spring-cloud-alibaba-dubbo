package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsIntegrationChangeHistoryService;
import com.ums.domain.UmsIntegrationChangeHistory;
import com.ums.mapper.UmsIntegrationChangeHistoryMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 积分变化历史记录表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsIntegrationChangeHistoryServiceImpl extends ServiceImpl<UmsIntegrationChangeHistoryMapper, UmsIntegrationChangeHistory> implements UmsIntegrationChangeHistoryService {

}
