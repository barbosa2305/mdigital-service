package br.com.javaweb.mdigital.infra.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter implements Filter {
	
	public CORSFilter() {
	}

	@Override
	public void init(final FilterConfig filterConfig) {

	}

	@Override
	public void doFilter(final ServletRequest servletRequest, final ServletResponse servletResponse, final FilterChain filterChain) throws IOException, ServletException {
		final HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
		final HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
		
		httpResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
		httpResponse.setHeader("Access-Control-Max-Age", "3600");
		//httpResponse.setHeader("Access-Control-Allow-Headers", "Accept, Content-Type, x-requested-with, authorization, token");
		httpResponse.setHeader("Access-Control-Allow-Headers", "Accept, Accept-Language, Content-Language, Content-Type");
		
		if ("OPTIONS".equalsIgnoreCase(httpRequest.getMethod())) {
			httpResponse.setStatus(HttpServletResponse.SC_OK);
			
		} else {
			filterChain.doFilter(servletRequest, servletResponse);			
		}
	}

	@Override
	public void destroy() {

	}
}