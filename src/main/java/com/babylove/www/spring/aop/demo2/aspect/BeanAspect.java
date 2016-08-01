package com.babylove.www.spring.aop.demo2.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @author zhangjiawei
 */
@Component
public class BeanAspect {
	
	/**
	 * 环绕通知
	 * @param pjp 环绕通知，必须有ProceedingJoinPoint作为参数
	 * @return 而且必须返回object类型
	 * @throws Throwable 异常可以抛出，也可以捕捉，看业务而定
	 */
	public Object around(ProceedingJoinPoint pjp, String name, int age) throws Throwable{
		System.out.println("around 1");
		System.out.println("around 2");
		System.out.println("This is print from aspect:name="+name+",age="+age);
		//执行业务方法
		Object object = pjp.proceed();
		System.out.println("around 3");
		System.out.println("around 4");
		return object;
	}
}
