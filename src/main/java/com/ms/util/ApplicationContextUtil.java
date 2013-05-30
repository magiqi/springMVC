package com.ms.util;

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

    public <T> T getBean(Class<T> a) {
	return applicationContext.getBean(a);
    }

    public void setApplicationContext(ApplicationContext context)
	    throws BeansException {
	applicationContext = context;

    }

    public static ApplicationContext getApplicationContext() {
	return applicationContext;
    }

}
