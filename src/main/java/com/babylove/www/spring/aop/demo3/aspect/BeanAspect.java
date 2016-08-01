package com.babylove.www.spring.aop.demo3.aspect;

import org.springframework.stereotype.Component;

/**
 * @author zhangjiawei
 */
@Component
public class BeanAspect {
	
	public void before(){
		System.out.println("before");
	}
}
