package com.babylove.www.spring.aop.demo1.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * 详情请看aop/demo1.xml
 * @author zhangjiawei
 *
 */
@Component
public class BeanAspect {
	
	/**
	 * 执行业务前被调用
	 */
	public void before(){
		System.out.println("before");
	}
	
	/**
	 * 抛出异常后被调用
	 */
	public void afterThrowing(){
		System.out.println("after Throwing");
	}
	
	/**
	 * 返回结果后被调用(包括void,void也是一个返回类型),如果有异常，不会被执行
	 */
	public void afterReturning(){
		System.out.println("after-returning");
	}
	
	/**
	 * 执行业务后被调用,无论什么情况，一定被执行
	 */
	public void after(){
		System.out.println("after");
	}
	
	/**
	 * 环绕通知
	 * @param pjp 环绕通知，必须有ProceedingJoinPoint作为参数
	 * @return 而且必须返回object类型
	 * @throws Throwable 异常可以抛出，也可以捕捉，看业务而定
	 */
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around 1");
		System.out.println("around 2");
		//执行业务方法
		Object object = pjp.proceed();
		System.out.println("around 3");
		System.out.println("around 4");
		return object;
	}
}
