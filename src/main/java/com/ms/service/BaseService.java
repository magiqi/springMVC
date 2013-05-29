package com.ms.service;

import com.ms.util.ApplicationContextUtil;

public class BaseService {

	public void save(Object o) {
		ApplicationContextUtil.getSession().save(o);
		int a = 21 / 0;
	}

}
