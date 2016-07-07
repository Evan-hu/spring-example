package com.babylove.www.spring.aopAndIoc.demo4;

import org.junit.Test;

import com.babylove.www.UnitTestBase;

public class Demo4Test extends UnitTestBase{

	public Demo4Test() {
		super("classpath:/iocAndAop/demo4.xml");
	}
	
	/**
	 * 直接执行即可，/iocAndAop/demo4.xml里面声明的bean的方法，会在初始化时候执行
	 */
	@Test
	public void applicationContextAwareAndBeanNameAwareTest(){
		
	}
	

}
