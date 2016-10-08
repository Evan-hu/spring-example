package com.babylove.www.spring.aop.demo5.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
/**
 * 后置通知
 * 
 * 可以访问返回值（但不能修改),被调用的方法，方法的参数和目标
 * 
 * @author zhangjiawei
 *
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("advice=afterReturning, returnValue="+returnValue+",method="+method.getName()+",target="+target.getClass().getSimpleName());
	}

}
