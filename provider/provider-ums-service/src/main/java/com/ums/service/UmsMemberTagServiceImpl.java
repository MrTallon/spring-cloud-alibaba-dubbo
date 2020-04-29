package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsMemberTagService;
import com.ums.domain.UmsMemberTag;
import com.ums.mapper.UmsMemberTagMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 用户标签表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsMemberTagServiceImpl extends ServiceImpl<UmsMemberTagMapper, UmsMemberTag> implements UmsMemberTagService {

}
