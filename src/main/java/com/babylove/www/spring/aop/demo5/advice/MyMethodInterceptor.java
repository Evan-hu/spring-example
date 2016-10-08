package com.babylove.www.spring.aop.demo5.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知
 * 必须实现Interceptor接口并且实现invoke方法
 * @author zhangjiawei
 *
 */
public class MyMethodInterceptor implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("advice=aroundAdvice, method=" + invocation.getMethod().getName()+",target=" + invocation.getStaticPart().getClass().getSimpleName());
		Object object = invocation.proceed();
		System.out.println("advice=aroundAdvice");
		return object;
	}
}
