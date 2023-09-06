package xyz.pplax.pplaxnetdisk.util;

import com.qiwenshare.common.constant.PlatformEnum;
import com.qiwenshare.common.util.CollectUtil;
import com.qiwenshare.common.util.DateUtil;
import xyz.pplax.pplaxnetdisk.domain.OperationLog;

import javax.servlet.http.HttpServletRequest;

public class OperationLogUtil {

    /**
     * 构造操作日志参数
     *
     * @param request   请求
     * @param isSuccess 操作是否成功（成功/失败）
     * @param source    操作源模块
     * @param operation 执行操作
     * @param detail    详细信息
     * @return 操作日志参数
     */
    public static OperationLog getOperationLogObj(HttpServletRequest request, String userId, String isSuccess, String source, String operation, String detail) {

        //用户需要登录才能进行的操作，需要记录操作日志
        OperationLog operationLog = new OperationLog();
        operationLog.setUserid(userId);
        operationLog.setTime(DateUtil.getCurrentTime());
        operationLog.setTerminal(new CollectUtil().getClientIpAddress(request));
        operationLog.setSource(source);
        operationLog.setResult(isSuccess);
        operationLog.setOperation(operation);
        operationLog.setDetail(detail);
        operationLog.setPlatform(PlatformEnum.PAN.getCode());
        operationLog.setRequesturi(request.getRequestURI());
        operationLog.setRequestmethod(request.getMethod());

        return operationLog;
    }

}
