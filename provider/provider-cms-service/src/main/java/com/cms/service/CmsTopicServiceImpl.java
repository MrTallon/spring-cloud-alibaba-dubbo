package com.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cms.api.CmsTopicService;
import com.cms.domain.CmsTopic;
import com.cms.mapper.CmsTopicMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 话题表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class CmsTopicServiceImpl extends ServiceImpl<CmsTopicMapper, CmsTopic> implements CmsTopicService {

}
