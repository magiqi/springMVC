package com.ms.common.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.ServletContextRequestLoggingFilter;

public class Testfilter extends ServletContextRequestLoggingFilter {

	@Override
	protected void afterRequest(HttpServletRequest request, String message) {
		System.out.println("���Ѿ�������action,���Կ�������");
		super.afterRequest(request, message);
	}

	@Override
	protected void beforeRequest(HttpServletRequest request, String message) {
		System.out.println("���Ѿ�������action,������Լ�session�ύ");
		super.beforeRequest(request, message);
	}

}
