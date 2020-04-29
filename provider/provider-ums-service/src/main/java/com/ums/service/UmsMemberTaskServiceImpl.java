package com.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ums.api.UmsMemberTaskService;
import com.ums.domain.UmsMemberTask;
import com.ums.mapper.UmsMemberTaskMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员任务表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-29
 */
@Service(version = "1.0.0")
public class UmsMemberTaskServiceImpl extends ServiceImpl<UmsMemberTaskMapper, UmsMemberTask> implements UmsMemberTaskService {

}
