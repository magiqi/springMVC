package com.ms.service;

import org.springframework.stereotype.Service;

import com.ms.util.ApplicationContextUtil;

@Service
public class BaseService {

	public void save(Object o) {
		ApplicationContextUtil.getSession().save(o);
		int a = 21 / 0;
	}

}
