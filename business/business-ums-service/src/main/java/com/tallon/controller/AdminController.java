package com.tallon.controller;

import com.tallon.api.AdminService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tallon.commons.dto.ResponseResult;
import com.tallon.domain.Admin;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 用户注册
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-28 11:20
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "reg")
public class AdminController {

    @Resource
    private BCryptPasswordEncoder passwordEncoder;

    @Reference(version = "1.0.0")
    private AdminService service;

    @GetMapping(value = "/test")
    public List<Admin> test() {
        return service.list();
    }

    /**
     * 注册
     *
     * @param umsAdmin {@link Admin}
     * @return {@link ResponseResult}
     */
    @PostMapping(value = "/save")
    public ResponseResult<Admin> save(@RequestBody Admin umsAdmin) {
        String message = validateReg(umsAdmin);

        // 通过验证
        if (message == null) {
            umsAdmin.setCreateTime(LocalDateTime.now());
            umsAdmin.setLoginTime(LocalDateTime.now());
            if (umsAdmin.getStatus() == null) {
                umsAdmin.setStatus(0);
            }
            umsAdmin.setPassword(passwordEncoder.encode(umsAdmin.getPassword()));
            boolean save = service.save(umsAdmin);
            // 注册成功
            if (save) {
//                Admin admin = service.getOne(Wrappers.<Admin>lambdaQuery()
//                        .eq(Admin::getUsername, umsAdmin.getUsername()));
                Admin admin = service.getOne(new QueryWrapper<>(new Admin().setUsername(umsAdmin.getUsername())));
                return new ResponseResult<>(HttpStatus.OK.value(), "用户注册成功", admin);
            }
        }

        return new ResponseResult<>(HttpStatus.NOT_ACCEPTABLE.value(), message != null ? message : "用户注册失败");
    }

    /**
     * 注册信息验证
     *
     * @param umsAdmin {@link Admin}
     * @return 验证结果
     */
    private String validateReg(Admin umsAdmin) {
        // TODO 改为 hibernate validate 注解处理
        Admin admin = service.getOne(new QueryWrapper<>(new Admin().setUsername(umsAdmin.getUsername())));
        if (admin != null) {
            return "用户名已存在，请重新输入";
        }
        return null;
    }

}