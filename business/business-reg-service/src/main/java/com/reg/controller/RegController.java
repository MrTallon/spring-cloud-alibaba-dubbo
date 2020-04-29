package com.reg.controller;

import com.tallon.commons.dto.ResponseResult;
import com.ums.api.UmsAdminService;
import com.ums.domain.UmsAdmin;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;


/**
 * 注册服务
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-29 15:16
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "reg")
public class RegController {

    @Resource
    private BCryptPasswordEncoder passwordEncoder;

    @Reference(version = "1.0.0")
    private UmsAdminService umsAdminService;

    @GetMapping(value = "/test")
    public List<UmsAdmin> test() {
        return umsAdminService.list();
    }

    /**
     * 注册
     * @param umsAdmin {@link UmsAdmin}
     * @return {@link ResponseResult}
     */
    @PostMapping(value ="")
    public ResponseResult<UmsAdmin> reg(@RequestBody UmsAdmin umsAdmin) {
        String message = validateReg(umsAdmin);

        // 通过验证
        if (message == null) {

            umsAdmin.setCreateTime(LocalDateTime.now());
            umsAdmin.setLoginTime(LocalDateTime.now());
            if (umsAdmin.getStatus() == null) {
                umsAdmin.setStatus(0);
            }
            umsAdmin.setPassword(passwordEncoder.encode(umsAdmin.getPassword()));

            boolean save = umsAdminService.save(umsAdmin);

            // 注册成功
            if (save) {
                UmsAdmin admin = umsAdminService.getByName(umsAdmin.getUsername());
                return new ResponseResult<>(HttpStatus.OK.value(), "用户注册成功", admin);
            }
        }

        return new ResponseResult<>(HttpStatus.NOT_ACCEPTABLE.value(), message != null ? message : "用户注册失败");
    }
    /**
     * 注册信息验证
     *
     * @param umsAdmin {@link UmsAdmin}
     * @return 验证结果
     */
    private String validateReg(UmsAdmin umsAdmin) {
        // TODO hibernate validate
        UmsAdmin admin = umsAdminService.getByName(umsAdmin.getUsername());

        if (admin != null) {
            return "用户名已存在，请重新输入";
        }
        return null;
    }
}
