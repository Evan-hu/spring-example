package com.babylove.www.spring.ioc.demo4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 实现ApplicationContextAwareDemo接口
 * 获取applicationContext
 * @author zhangjiawei
 *
 */
public class ApplicationContextAwareDemo implements ApplicationContextAware{

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAwareDemo:" + ApplicationContextAwareDemo.class.hashCode());
	}

}
