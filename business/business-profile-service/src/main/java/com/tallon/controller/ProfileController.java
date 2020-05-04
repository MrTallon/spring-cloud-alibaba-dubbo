package com.tallon.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tallon.commons.dto.ResponseResult;
import com.tallon.controller.fallback.ProfileControllerFallback;
import com.tallon.dto.IconParam;
import com.tallon.dto.PasswordParam;
import com.tallon.dto.ProfileParam;
import com.tallon.dto.UmsAdminDTO;
import com.ums.api.UmsAdminService;
import com.ums.domain.UmsAdmin;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 个人信息管理
 *
 * @author tallon
 * @version v1.0.0
 * @date 2020-04-30 00:03
 */
@RestController
@RequestMapping(value = "profile")
public class ProfileController {

    @Reference(version = "1.0.0")
    private UmsAdminService umsAdminService;

    @Resource
    private BCryptPasswordEncoder passwordEncoder;

    /**
     * 获取个人信息
     *
     * @param username {@code String} 用户名
     * @return {@link ResponseResult}
     */
    @GetMapping(value = "info/{username}")
    @SentinelResource(value = "info", fallback = "infoFallback", fallbackClass = ProfileControllerFallback.class)
    public ResponseResult<UmsAdminDTO> info(@PathVariable String username) {
        UmsAdmin umsAdmin = umsAdminService.getByName(username);
        UmsAdminDTO dto = new UmsAdminDTO();
        BeanUtils.copyProperties(umsAdmin, dto);
        return new ResponseResult<UmsAdminDTO>(ResponseResult.CodeStatus.OK, "获取个人信息", dto);
    }

    /**
     * 更新个人信息
     *
     * @param profileParam {@link ProfileParam}
     * @return {@link ResponseResult}
     */
    @PostMapping(value = "update")
    public ResponseResult<Void> update(@RequestBody ProfileParam profileParam) {
        UmsAdmin newUmsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(profileParam, newUmsAdmin);
        boolean result = umsAdminService.update(new QueryWrapper<>(newUmsAdmin));

        // 成功
        if (result) {
            return new ResponseResult<Void>(ResponseResult.CodeStatus.OK, "更新个人信息成功");
        }

        // 失败
        else {
            return new ResponseResult<Void>(ResponseResult.CodeStatus.FAIL, "更新个人信息失败");
        }
    }

    /**
     * 修改密码
     *
     * @param passwordParam {@link PasswordParam}
     * @return {@link ResponseResult}
     */
    @PostMapping(value = "modify/password")
    public ResponseResult<Void> modifyPassword(@RequestBody PasswordParam passwordParam) {
        UmsAdmin umsAdmin = umsAdminService.getByName(passwordParam.getUsername());

        // 旧密码正确
        if (passwordEncoder.matches(passwordParam.getOldPassword(), umsAdmin.getPassword())) {
            boolean result = umsAdminService.modifyPassword(umsAdmin.getUsername(), passwordParam.getNewPassword());
            if (result) {
                return new ResponseResult<Void>(ResponseResult.CodeStatus.OK, "修改密码成功");
            }
        }

        // 旧密码错误
        else {
            return new ResponseResult<Void>(ResponseResult.CodeStatus.FAIL, "旧密码不匹配，请重试");
        }

        return new ResponseResult<Void>(ResponseResult.CodeStatus.FAIL, "修改密码失败");
    }

    /**
     * 修改头像
     *
     * @param iconParam {@link IconParam}
     * @return {@link ResponseResult}
     */
    @PostMapping(value = "modify/icon")
    public ResponseResult<Void> modifyIcon(@RequestBody IconParam iconParam) {
        boolean result = umsAdminService.modifyIcon(iconParam.getUsername(), iconParam.getPath());

        // 成功
        if (result) {
            return new ResponseResult<Void>(ResponseResult.CodeStatus.OK, "更新头像成功");
        }

        // 失败
        else {
            return new ResponseResult<Void>(ResponseResult.CodeStatus.FAIL, "更新头像失败");
        }
    }
}
