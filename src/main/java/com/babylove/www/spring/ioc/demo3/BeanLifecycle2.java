package com.babylove.www.spring.ioc.demo3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 实现InitializingBean(初始化)和DisposableBean(销毁)
 * @author zhangjiawei
 *
 */
public class BeanLifecycle2 implements InitializingBean,DisposableBean{

	public void destroy() throws Exception {
		System.out.println("destory");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
	
}
