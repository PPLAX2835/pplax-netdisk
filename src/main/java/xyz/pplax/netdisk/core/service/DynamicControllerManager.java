package xyz.pplax.netdisk.core.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * 管理请求映射以及相关处理程序的注册和取消注册
 */
@Service
public class DynamicControllerManager {

    @Resource
    private RequestMappingHandlerMapping requestMappingHandlerMapping;

    private RequestMappingInfo shortLinkMappingInfo;        // 用于保存短链接请求映射信息

    private Object shortLinkHandler;                        // 保存短链接请求的处理程序

    private Method shortLinkMethod;                         // 保存短链接请求的处理方法

    /**
     * 初始化直链前缀路径，注册请求映射信息
     *
     * @param path    请求路径前缀
     * @param handler 请求的处理程序
     * @param method  请求的处理方法
     */
    public void initDirectLinkPrefixPath(String path, Object handler, Method method) {
        if (shortLinkMappingInfo != null) {
            throw new RuntimeException("请勿重复初始化 DirectLinkPrefixPath.");
        }

        // 创建请求映射信息，用于匹配以指定路径为前缀的请求
        shortLinkMappingInfo = RequestMappingInfo.paths(path + "/{storageKey}/**").build();
        shortLinkHandler = handler;             // 保存处理程序
        shortLinkMethod = method;               // 保存处理方法
        // 注册请求映射信息，将指定的路径与处理程序关联起来
        requestMappingHandlerMapping.registerMapping(shortLinkMappingInfo, handler, method);
    }

    /**
     * 更改直链前缀路径，取消注册之前的请求映射信息，并注册新的请求映射信息
     *
     * @param path 新的请求路径前缀
     */
    public void changeDirectLinkPrefixPath(String path) {
        if (shortLinkMappingInfo != null) {
            // 取消之前的请求映射信息，将之前的路径与处理程序解绑
            requestMappingHandlerMapping.unregisterMapping(shortLinkMappingInfo);
        }
        // 创建新的请求映射信息，用于匹配以新的路径为前缀的请求
        shortLinkMappingInfo = RequestMappingInfo.paths(path + "/**").build();
        // 注册新的请求映射信息，将新的路径与之前保存的处理程序和处理方法关联起来
        requestMappingHandlerMapping.registerMapping(shortLinkMappingInfo, shortLinkHandler, shortLinkMethod);
    }

}
