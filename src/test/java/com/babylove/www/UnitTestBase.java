package com.babylove.www;

import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.junit.After;
//import org.junit.Before;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.util.StringUtils;
/**
 * 单元测试基类
 * @author zhangjiawei
 *
 */
public class UnitTestBase {
	
	private ClassPathXmlApplicationContext context;
	
	private String springXmlPath;
	
	public UnitTestBase(String springXmlPath) {
		this.springXmlPath = springXmlPath;
	}
	
	@Before
	public void before(){
		if(StringUtils.isEmpty(springXmlPath)){
			springXmlPath = "classpath:spring-*.xml";
		}
		try {
			context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
			context.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@After
	public void after(){
		context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId) {
		return (T)context.getBean(beanId);
	}
	
	protected <T extends Object> T getBean(Class<T> clazz) {
		return (T)context.getBean(clazz);
	}
}
