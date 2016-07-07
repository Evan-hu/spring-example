package com.babylove.www.spring.aopAndIoc.demo4;

import org.springframework.beans.factory.BeanNameAware;

/**
 * 实现BeanNameAware
 * 获取当前bean的name
 * @author zhangjiawei
 *
 */
public class BeanNameAwareDemo implements BeanNameAware{

	public void setBeanName(String name) {
		System.out.println("BeanNameAwareDemo:" + name);
	}

}
