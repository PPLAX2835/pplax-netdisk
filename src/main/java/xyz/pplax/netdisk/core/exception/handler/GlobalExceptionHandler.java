package xyz.pplax.netdisk.core.exception.handler;

import cn.dev33.satoken.exception.NotLoginException;
import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson2.JSON;
import xyz.pplax.netdisk.core.exception.*;
import xyz.pplax.netdisk.core.exception.file.init.InitializeStorageSourceException;
import xyz.pplax.netdisk.core.exception.file.operator.DisableProxyDownloadException;
import xyz.pplax.netdisk.core.exception.file.operator.StorageSourceFileOperatorException;
import xyz.pplax.netdisk.core.util.AjaxJson;
import xyz.pplax.netdisk.core.util.RequestHolder;
import xyz.pplax.netdisk.core.util.StringUtils;
import xyz.pplax.netdisk.module.config.service.SystemConfigService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.ClientAbortException;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 全局异常处理
 *
 * @author zhaojun
 */
@ControllerAdvice
@Slf4j
@Order(1)
public class GlobalExceptionHandler {

    @Resource
    private SystemConfigService systemConfigService;


    /**
     * 存储源文件操作相关异常处理
     */
    @ExceptionHandler(value = StorageSourceException.class)
    @ResponseBody
    @ResponseStatus
    public AjaxJson<String> storageSourceException(StorageSourceException e) {
        log.error("存储源 {} 出现异常", e.getStorageId(), e);
        return AjaxJson.getError(e.getResultMessage());
    }

    /**
     * 存储源初始化相关异常处理
     */
    @ExceptionHandler(value = InitializeStorageSourceException.class)
    @ResponseBody
    @ResponseStatus
    public AjaxJson<String> initializeException(InitializeStorageSourceException e) {
        log.error("初始化存储源 {} 失败", e.getStorageId(), e);
        return AjaxJson.getError(e.getResultMessage());
    }

    /**
     * 存储源文件操作相关异常处理
     */
    @ExceptionHandler(value = StorageSourceFileOperatorException.class)
    @ResponseBody
    @ResponseStatus
    public AjaxJson<String> storageSourceFileOperatorException(StorageSourceFileOperatorException e) {
        log.error("存储源 {} 文件操作异常", e.getStorageId(), e);
        return AjaxJson.getError(e.getResultMessage());
    }

    /**
     * 获取文件信息异常
     * @param e
     * @return
     */
    @ExceptionHandler({PPLAXRuntimeException.class})
    @ResponseBody
    @ResponseStatus
    public AjaxJson<String> getFileInfoException(PPLAXRuntimeException e) {
        if (e.getCause() != null) {
            log.error("PPLAXRuntimeException", e);
        }
        return AjaxJson.getError(e.getMessage());
    }

    /**
     * 404异常
     * @param e
     * @return
     */
    @ExceptionHandler({InvalidShortLinkException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public AjaxJson<String> getFileInfoException(InvalidShortLinkException e) {
        return AjaxJson.getError(e.getMessage());
    }

    /**
     * 403
     * @param e
     * @return
     */
    @ExceptionHandler({IllegalDownloadLinkException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public AjaxJson<String> getFileInfoException(IllegalDownloadLinkException e) {
        return AjaxJson.getError(e.getMessage());
    }

    /**
     * 登录认证异常
     * @param e
     * @return
     */
    @ExceptionHandler({LoginVerifyException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public AjaxJson<String> loginVerifyException(LoginVerifyException e) {
        return AjaxJson.getError(e.getMessage());
    }

    /**
     * 参数合法性处理异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = {MethodArgumentNotValidException.class, BindException.class})
    @ResponseBody
    public AjaxJson<Map<String, String>> handleValidException(Exception e) {
        BindingResult bindingResult = null;
        if (e instanceof MethodArgumentNotValidException) {
            bindingResult = ((MethodArgumentNotValidException) e).getBindingResult();
        } else if (e instanceof BindException) {
            bindingResult = ((BindException) e).getBindingResult();
        }
        Map<String, String> errorMap = new HashMap<>(16);

        Optional.ofNullable(bindingResult)
                .map(BindingResult::getFieldErrors)
                .ifPresent(fieldErrors -> {
                    for (FieldError fieldError : fieldErrors) {
                        errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
                    }
                });
        return new AjaxJson<>(400, "非法参数 !", errorMap);
    }


    /**
     * 文件不存在的异常
     * @return
     */
    @ExceptionHandler({FileNotFoundException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public AjaxJson<String> fileNotFound() {
        return AjaxJson.getError("文件不存在");
    }


    /**
     * 密码校验异常
     */
    @ExceptionHandler({PasswordVerifyException.class})
    @ResponseBody
    @ResponseStatus
    public AjaxJson<?> passwordVerifyException(PasswordVerifyException ex) {
        return AjaxJson.get(ex.getCode(), ex.getMessage());
    }

    /**
     * 初始化时自动设置 cors 异常
     */
    @ExceptionHandler({StorageSourceAutoConfigCorsException.class})
    @ResponseBody
    @ResponseStatus
    public AjaxJson<String> autoConfigCorsException(StorageSourceAutoConfigCorsException ex) {
        log.error("跨域配置失败, 存储源初始化信息 {}, 异常信息: ", JSON.toJSON(ex.getIStorageParam()), ex);
        return AjaxJson.getError(ex.getMessage());
    }

    /**
     * 上传方式非法
     * @param e
     * @return
     */
    @ExceptionHandler({StorageSourceNotSupportProxyUploadException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AjaxJson<String> storageSourceNotSupportProxyUploadException(StorageSourceNotSupportProxyUploadException e) {
        return AjaxJson.getError("非法操作, 当前存储源不支持此方式上传.");
    }


    @ExceptionHandler(value = DisableProxyDownloadException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AjaxJson<String> disableProxyDownloadException(DisableProxyDownloadException e) {
        return AjaxJson.getError(e.getResultMessage());
    }

    @ExceptionHandler({HttpMessageNotReadableException.class})
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public AjaxJson<String> handlerHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        return AjaxJson.getBadRequestError("请求参数不合法");
    }

    /**
     * 捕获 ClientAbortException 异常, 不做任何处理, 防止出现大量堆栈日志输出, 此异常不影响功能.
     */
    @ExceptionHandler({HttpMediaTypeNotAcceptableException.class, ClientAbortException.class})
    @ResponseBody
    @ResponseStatus
    public void clientAbortException() {
        // if (log.isDebugEnabled()) {
        //     log.debug("出现了断开异常:", ex);
        // }
    }


    /**
     * 捕获 IORuntimeException 异常, 如果 cause 是 ClientAbortException, 不做任何处理, 防止出现大量堆栈日志输出, 此异常不影响功能.
     */
    @ExceptionHandler({ IORuntimeException.class })
    @ResponseBody
    @ResponseStatus
    public void ioRuntimeException(IORuntimeException e) {
        if (e.getCause() instanceof ClientAbortException) {
//            log.info("捕获 ClientAbortException 异常, 不做任何处理, 防止出现大量堆栈日志输出, 此异常不影响功能.");
            return;
        }
        log.error(e.getMessage(), e);
    }

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus
    public AjaxJson<String> extraExceptionHandler(Exception e) {
        log.error(e.getMessage(), e);

        if (e.getClass() == Exception.class) {
            return AjaxJson.getError("系统异常, 请联系管理员");
        } else {
            return AjaxJson.getError(e.getMessage());
        }
    }


    /**
     * 登录异常拦截器
     */
    @ExceptionHandler(NotLoginException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public AjaxJson handlerNotLoginException(NotLoginException e) {
        HttpServletRequest request = RequestHolder.getRequest();
        String axiosRequest = request.getHeader("axios-request");
        if (StrUtil.isNotEmpty(axiosRequest)){
        	return AjaxJson.getNotLogin();
        }
        try {
            String domain = systemConfigService.getRealFrontDomain();
            if (StrUtil.isEmpty(domain)) {
                domain = "/";
            }
            String loginUrl = StringUtils.removeDuplicateSlashes(domain + "/login");
            RequestHolder.getResponse().sendRedirect(loginUrl);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return null;
    }

}