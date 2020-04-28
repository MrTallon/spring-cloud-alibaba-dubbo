package com.tallon.service;

import com.tallon.domain.PrefrenceArea;
import com.tallon.mapper.PrefrenceAreaMapper;
import com.tallon.api.PrefrenceAreaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 优选专区 服务实现类
 * </p>
 *
 * @author Tallon
 * @since 2020-04-28
 */
@Service(version = "1.0.0")
public class PrefrenceAreaServiceImpl extends ServiceImpl<PrefrenceAreaMapper, PrefrenceArea> implements PrefrenceAreaService {

}