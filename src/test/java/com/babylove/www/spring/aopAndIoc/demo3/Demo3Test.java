package com.babylove.www.spring.aopAndIoc.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo3Test extends UnitTestBase{
	public Demo3Test() {
		super("classpath:/iocAndAop/demo3.xml");
	}
	
	/**
	 * 在iocAndAop/demo3.xml中声明了初始化调用start方法和销毁调用stop方法
	 */
	@Test
	public void testBeanLifecycle1(){
		super.getBean("beanLifecycle1");
	}
	
	/**
	 * 第二种方式是实现InitializingBean(初始化)和DisposableBean(销毁)
	 */
	@Test
	public void testBeanLifecycle2(){
		super.getBean("beanLifecycle2");
	}
}
