package com.babylove.www.spring.ioc.demo7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;
import com.babylove.www.spring.ioc.demo7.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo7Test extends JUnitBase{

	public Demo7Test() {
		super("classpath:/ioc/demo7.xml");
	}
	
	@Test
	public void autowiredTest(){
		InjectionService injectionService = super.getBean("injectionServiceImpl");
		injectionService.save("This is autowired test.");
	}

}
