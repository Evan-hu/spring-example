package com.babylove.www.spring.aopAndIoc.demo7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.UnitTestBase;
import com.babylove.www.spring.aopAndIoc.demo7.service.InjectionService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo7Test extends UnitTestBase{

	public Demo7Test() {
		super("classpath:/iocAndAop/demo7.xml");
	}
	
	@Test
	public void autowiredTest(){
		InjectionService injectionService = super.getBean("injectionServiceImpl");
		injectionService.save("This is autowired test.");
	}

}
