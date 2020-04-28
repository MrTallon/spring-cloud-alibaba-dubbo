package com.tallon.service;

import com.tallon.domain.Topic;
import com.tallon.mapper.TopicMapper;
import com.tallon.api.TopicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 话题表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements TopicService {

}
