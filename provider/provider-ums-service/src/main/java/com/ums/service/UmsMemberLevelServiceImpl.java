package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsMemberLevelService;
import com.ums.domain.UmsMemberLevel;
import com.ums.mapper.UmsMemberLevelMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员等级表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsMemberLevelServiceImpl extends ServiceImpl<UmsMemberLevelMapper, UmsMemberLevel> implements UmsMemberLevelService {

}
