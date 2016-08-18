package com.babylove.www.spring.aop.demo4.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * 异常通知
 * 
 * 如果连接点抛出异常，throws advice在连接点返回后被调用
 * 如果throws advice抛出异常，那么它将覆盖原有的异常
 * 
 * 请查看该接口
 * 必须实现afterThrowing这个方法
 * 有4种实现方式，分别是
 * public void afterThrowing(Exception ex)
 * public void afterThrowing(RemoteException)
 * public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
 * public void afterThrowing(Method method, Object[] args, Object target, ServletException ex)
 * 选择一种即可
 * @author zhangjiawei
 *
 */
public class MyThrowsAdvice implements ThrowsAdvice{
	
	public void afterThrowing(Exception ex){
		System.out.println("advice=afterThrowing1");
	}
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
		System.out.println("advice=afterThrowing2,method=" + method.getName() + ",target=" + target.getClass().getSimpleName());
	}
}
