package com.babylove.www.spring.ioc.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;
import com.babylove.www.spring.ioc.demo1.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo1Test extends JUnitBase{
	
	public Demo1Test() {
		super("classpath:/ioc/demo1.xml");
	}
	
	/**
	 * 设值注入测试
	 */
	@Test
	public void testSetter(){
		InjectionService injectionService = super.getBean("injectionService");
		injectionService.save("这是要保存的数据");
	}
	
	/**
	 * 构造注入测试
	 */
	@Test
	public void testConstructor(){
		InjectionService injectionService = super.getBean("injectionService1");
		injectionService.save("这是要保存的数据");
	}
}
