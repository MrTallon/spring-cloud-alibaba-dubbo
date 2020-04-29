package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsMemberService;
import com.ums.domain.UmsMember;
import com.ums.mapper.UmsMemberMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService {

}
