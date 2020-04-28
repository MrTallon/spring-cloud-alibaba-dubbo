package com.tallon.service;

import com.tallon.domain.Help;
import com.tallon.mapper.HelpMapper;
import com.tallon.api.HelpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 帮助表 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class HelpServiceImpl extends ServiceImpl<HelpMapper, Help> implements HelpService {

}
