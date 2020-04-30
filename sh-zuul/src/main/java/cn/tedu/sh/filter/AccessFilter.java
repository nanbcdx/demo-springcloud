package cn.tedu.sh.filter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


@Component
public class AccessFilter extends ZuulFilter {

	/**
	 * 根据serviceId来过滤指定服务请求
	 * 过滤所有服务,直接返回true
	 */
	@Override
	public boolean shouldFilter() {
		RequestContext context = RequestContext.getCurrentContext();
		String serviceId =(String) context.get(FilterConstants.SERVICE_ID_KEY);
		if("web-service".equals(serviceId)) return true;
		return false;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext context = RequestContext.getCurrentContext();
		HttpServletRequest request = context.getRequest();
		String token = request.getParameter("token");
		if(StringUtils.isEmpty(token)) {
			context.setSendZuulResponse(false);
			context.setResponseStatusCode(202);
			context.setResponseBody("没有权限访问");
		}
		return null;
	}

	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		return FilterConstants.PRE_DECORATION_FILTER_ORDER+1;
	}

}
