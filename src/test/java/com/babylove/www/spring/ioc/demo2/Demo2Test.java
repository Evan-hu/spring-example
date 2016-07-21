package com.babylove.www.spring.ioc.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo2Test extends JUnitBase{

	public Demo2Test() {
		super("classpath:/ioc/demo2.xml");
	}
	
	/**
	 * 由于demo2.xml的beanScopeBySingleton的scope=singleton
	 * 所以无论获取多少次对象，都是同一个
	 */
	@Test
	public void testSingleton(){
		BeanScopeBySingleton b = super.getBean("beanScopeBySingleton");
		BeanScopeBySingleton b1 = super.getBean("beanScopeBySingleton");
		b.say();
		b1.say();
	}
	
	/**
	 * demo2.xml的beanScopeByPrototype的scope=prototyoe
	 * 每次获取都是一个新的实例
	 */
	@Test
	public void testPrototype(){
		BeanScopeByPrototype b = super.getBean("beanScopeByPrototype");
		BeanScopeByPrototype b1 = super.getBean("beanScopeByPrototype");
		b.say();
		b1.say();
	}
}
