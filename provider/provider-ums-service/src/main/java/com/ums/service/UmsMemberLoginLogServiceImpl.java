package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsMemberLoginLogService;
import com.ums.domain.UmsMemberLoginLog;
import com.ums.mapper.UmsMemberLoginLogMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员登录记录 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsMemberLoginLogServiceImpl extends ServiceImpl<UmsMemberLoginLogMapper, UmsMemberLoginLog> implements UmsMemberLoginLogService {

}
