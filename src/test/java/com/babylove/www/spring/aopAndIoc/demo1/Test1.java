package com.babylove.www.spring.aopAndIoc.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.UnitTestBase;
import com.babylove.www.spring.aopAndIoc.demo1.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Test1 extends UnitTestBase{
	
	public Test1() {
		super("classpath:/applicationContext.xml");
	}
	
	@Test
	public void testSetter(){
		InjectionService injectionService = super.getBean("injectionService");
		injectionService.save("这是要保存的数据");
	}
	
	@Test
	public void testConstructor(){
		InjectionService injectionService = super.getBean("injectionService1");
		injectionService.save("这是要保存的数据");
	}
}
