package com.ms.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * string¿‡util
 * 
 * @author magi.qi
 * 
 */
public class ApplicationContextUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	private static SessionFactory sessionFactory;

	public <T> T getBean(Class<T> a) {
		return applicationContext.getBean(a);
	}

	public static Session getSession() {
		return sessionFactory.openSession();
	}

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		applicationContext = context;

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		ApplicationContextUtil.sessionFactory = sessionFactory;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

}
