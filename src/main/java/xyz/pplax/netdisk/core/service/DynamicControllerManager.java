package xyz.pplax.netdisk.core.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * 动态注册和注销请求映射
 */
@Service
public class DynamicControllerManager {

    @Resource
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    private RequestMappingInfo shortLinkMappingInfo;

    private Object shortLinkHandler;

    private Method shortLinkMethod;

    /**
     * 初始化直接链接的前缀路径
     * @param path
     * @param handler
     * @param method
     */
    public void initDirectLinkPrefixPath(String path, Object handler, Method method) {
        if (shortLinkMappingInfo != null) {
            throw new RuntimeException("请勿重复初始化 DirectLinkPrefixPath.");
        }
        shortLinkMappingInfo = RequestMappingInfo.paths(path + "/{storageKey}/**").build();
        shortLinkHandler = handler;
        shortLinkMethod = method;
        requestMappingHandlerMapping.registerMapping(shortLinkMappingInfo, handler, method);
    }

    /**
     * 改变直接链接的前缀路径
     * @param path
     */
    public void changeDirectLinkPrefixPath(String path) {
        if (shortLinkMappingInfo != null) {
            requestMappingHandlerMapping.unregisterMapping(shortLinkMappingInfo);
        }
        shortLinkMappingInfo = RequestMappingInfo.paths(path + "/**").build();
        requestMappingHandlerMapping.registerMapping(shortLinkMappingInfo, shortLinkHandler, shortLinkMethod);
    }

}
