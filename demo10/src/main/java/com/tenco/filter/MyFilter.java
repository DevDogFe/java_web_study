package com.tenco.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(">>>필터초기화<<<");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// for filter to Servlet
		System.out.println("---1---");
		request.setCharacterEncoding("utf-8");
		chain.doFilter(request, response);
		// 구현된 서블릿에서 직접 응답 처리를 지정하는 것이 바람직하다
		// response.setContentType("text/plain; charset=UTF-8");
		System.out.println("---3---");
	}
	
	@Override
	public void destroy() {
		System.out.println(">>>필터destroy<<<");
	}

}
