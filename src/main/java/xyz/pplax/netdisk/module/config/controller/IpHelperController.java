package xyz.pplax.netdisk.module.config.controller;

import cn.hutool.extra.servlet.ServletUtil;
import xyz.pplax.netdisk.core.util.AjaxJson;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author zhaojun
 */
@Api(tags = "IP 地址辅助 Controller")
@Slf4j
@RequestMapping("/admin")
@RestController
public class IpHelperController {

    @Resource
    private HttpServletRequest httpServletRequest;

    @GetMapping("clientIp")
    public AjaxJson<String> clientIp() {
        String clientIp = ServletUtil.getClientIP(httpServletRequest);
        return AjaxJson.getSuccessData(clientIp);
    }

}