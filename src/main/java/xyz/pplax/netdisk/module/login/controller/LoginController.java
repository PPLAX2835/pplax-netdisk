package xyz.pplax.netdisk.module.login.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSort;
import dev.samstevens.totp.exceptions.QrGenerationException;
import xyz.pplax.netdisk.core.util.AjaxJson;
import xyz.pplax.netdisk.module.config.model.dto.SystemConfigDTO;
import xyz.pplax.netdisk.module.config.service.SystemConfigService;
import xyz.pplax.netdisk.module.login.model.enums.LoginVerifyModeEnum;
import xyz.pplax.netdisk.module.login.model.request.VerifyLoginTwoFactorAuthenticatorRequest;
import xyz.pplax.netdisk.module.login.model.result.LoginTwoFactorAuthenticatorResult;
import xyz.pplax.netdisk.module.login.model.result.LoginVerifyImgResult;
import xyz.pplax.netdisk.module.login.request.UserLoginRequest;
import xyz.pplax.netdisk.module.login.service.ImgVerifyCodeService;
import xyz.pplax.netdisk.module.login.service.TwoFactorAuthenticatorVerifyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Objects;

/**
 * 登陆注销相关接口
 *
 * @author zhaojun
 */
@Api(tags = "登录模块")
@ApiSort(1)
@RestController
@RequestMapping("/admin")
public class LoginController {

    @Resource
    private SystemConfigService systemConfigService;

    @Resource
    private ImgVerifyCodeService imgVerifyCodeService;

    @Resource
    private TwoFactorAuthenticatorVerifyService twoFactorAuthenticatorVerifyService;

    @ApiOperationSupport(order = 1, ignoreParameters = {"pplax-token"})
    @ApiOperation(value = "登录")
    @PostMapping("/login")
    public AjaxJson<?> doLogin(@Valid @RequestBody UserLoginRequest userLoginRequest) {
        SystemConfigDTO systemConfig = systemConfigService.getSystemConfig();

        String verifyCode = userLoginRequest.getVerifyCode();
        String verifyCodeUuid = userLoginRequest.getVerifyCodeUUID();

        LoginVerifyModeEnum loginVerifyMode = systemConfig.getLoginVerifyMode();
        String loginVerifySecret = systemConfig.getLoginVerifySecret();

        if (Objects.equals(loginVerifyMode, LoginVerifyModeEnum.TWO_FACTOR_AUTHENTICATION_MODE)) {
            twoFactorAuthenticatorVerifyService.checkCode(loginVerifySecret, verifyCode);
        } else if (Objects.equals(loginVerifyMode, LoginVerifyModeEnum.IMG_VERIFY_MODE)) {
            imgVerifyCodeService.checkCaptcha(verifyCodeUuid, verifyCode);
        }

        if (Objects.equals(systemConfig.getUsername(), userLoginRequest.getUsername()) &&
                Objects.equals(systemConfig.getPassword(), SecureUtil.md5(userLoginRequest.getPassword()))) {
            StpUtil.login("admin");
            SaTokenInfo tokenInfo = StpUtil.getTokenInfo();
            return AjaxJson.getSuccess("登录成功", tokenInfo.getTokenValue());
        }
        return AjaxJson.getError("登录失败, 账号或密码错误");
    }

    @ApiOperationSupport(order = 2)
    @ApiOperation(value = "注销")
    @PostMapping("/logout")
    public AjaxJson<?> logout() {
        StpUtil.logout();
        return AjaxJson.getSuccess("注销成功");
    }


    @ApiOperationSupport(order = 3)
    @ApiOperation(value = "生成 2FA")
    @GetMapping("/2fa/setup")
    public AjaxJson<LoginTwoFactorAuthenticatorResult> setupDevice() throws QrGenerationException {
        LoginTwoFactorAuthenticatorResult loginTwoFactorAuthenticatorResult = twoFactorAuthenticatorVerifyService.setupDevice();
        return AjaxJson.getSuccessData(loginTwoFactorAuthenticatorResult);
    }


    @ApiOperationSupport(order = 4)
    @ApiOperation(value = "2FA 验证并绑定")
    @PostMapping("/2fa/verify")
    public AjaxJson<?> deviceVerify(@Valid @RequestBody VerifyLoginTwoFactorAuthenticatorRequest verifyLoginTwoFactorAuthenticatorRequest) {
        twoFactorAuthenticatorVerifyService.deviceVerify(verifyLoginTwoFactorAuthenticatorRequest);
        return AjaxJson.getSuccess();
    }


    @ApiOperationSupport(order = 5)
    @ApiOperation(value = "获取登陆验证方式")
    @GetMapping("/login/verify-mode")
    public AjaxJson<LoginVerifyModeEnum> loginVerifyMode() {
        SystemConfigDTO systemConfig = systemConfigService.getSystemConfig();
        return AjaxJson.getSuccessData(systemConfig.getLoginVerifyMode());
    }


    @ApiOperationSupport(order = 6)
    @ApiOperation(value = "获取图形验证码")
    @GetMapping("/login/captcha")
    public AjaxJson<LoginVerifyImgResult> captcha() {
        LoginVerifyImgResult loginVerifyImgResult = imgVerifyCodeService.generatorCaptcha();
        return AjaxJson.getSuccessData(loginVerifyImgResult);
    }


    @ApiOperationSupport(order = 7)
    @ApiOperation(value = "检测是否已登录")
    @GetMapping("/login/check")
    public AjaxJson<Boolean> checkLogin() {
        return AjaxJson.getSuccessData(StpUtil.isLogin());
    }

}