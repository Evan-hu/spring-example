package com.babylove.www.spring.aop.demo5.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 前置通知
 * 
 * 只是在进入方法之前被调用
 * 前置通知可以在连接点执行之前插入自定义行为，但不能改变返回值
 * 
 * @author zhangjiawei
 *
 */
public class MyBeforeAdvice implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("advice=before, method=" + method.getName() + ", target:" + target.getClass().getSimpleName());
	}

}
