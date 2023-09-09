package xyz.pplax.netdisk.core.filter;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.extra.servlet.ServletUtil;
import xyz.pplax.netdisk.core.constant.MdcConstant;
import org.slf4j.MDC;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhaojun
 */
@WebFilter(urlPatterns = "/*")
public class MDCFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		// 设置日志上下文（MDC - Mapped Diagnostic Context）的一些关键信息
		// 用于在日志中跟踪请求的信息
		MDC.put(MdcConstant.TRACE_ID, IdUtil.fastUUID());											// uuid
		MDC.put(MdcConstant.IP, ServletUtil.getClientIP(httpServletRequest));						// 设置客户端IP地址
		MDC.put(MdcConstant.USER, StpUtil.isLogin() ? StpUtil.getLoginIdAsString() : "anonymous");	// 设置用户信息，如果已登录则为用户ID，否则为匿名用户
		
		try {
			filterChain.doFilter(httpServletRequest, httpServletResponse);
		} finally {
			MDC.clear();
		}
	}
	
}