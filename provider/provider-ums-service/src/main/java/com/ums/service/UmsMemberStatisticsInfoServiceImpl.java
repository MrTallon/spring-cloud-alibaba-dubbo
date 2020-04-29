package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsMemberStatisticsInfoService;
import com.ums.domain.UmsMemberStatisticsInfo;
import com.ums.mapper.UmsMemberStatisticsInfoMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员统计信息 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsMemberStatisticsInfoServiceImpl extends ServiceImpl<UmsMemberStatisticsInfoMapper, UmsMemberStatisticsInfo> implements UmsMemberStatisticsInfoService {

}
