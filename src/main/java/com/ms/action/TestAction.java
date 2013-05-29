package com.ms.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.ms.model.TestBean;
import com.ms.service.BaseService;

/**
 * 
 * @author magi.qi
 * 
 */
public class TestAction extends MultiActionController {

	public ModelAndView test(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println(baseService);
		TestBean testBean = new TestBean();
		testBean.setName("hh����");
		this.baseService.save(testBean);
		System.out.println("����ɹ�23");
		throw new Exception("��������");
	}

	/**
	 * ����bean
	 */
	private BaseService baseService;

	public BaseService getBaseService() {
		return baseService;
	}

	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}
}
