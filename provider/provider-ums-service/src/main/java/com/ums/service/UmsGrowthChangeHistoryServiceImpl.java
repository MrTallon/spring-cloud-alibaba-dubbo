package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsGrowthChangeHistoryService;
import com.ums.domain.UmsGrowthChangeHistory;
import com.ums.mapper.UmsGrowthChangeHistoryMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 成长值变化历史记录表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsGrowthChangeHistoryServiceImpl extends ServiceImpl<UmsGrowthChangeHistoryMapper, UmsGrowthChangeHistory> implements UmsGrowthChangeHistoryService {

}
