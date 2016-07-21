package com.babylove.www.spring.ioc.demo13;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;
import com.babylove.www.spring.ioc.demo13.service.JsrService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo13Test extends JUnitBase{

	public Demo13Test() {
		super("classpath:/ioc/demo13.xml");
	}
	
	@Test
	public void autowiredTest(){
		JsrService jsrService = super.getBean("jsrServiceImpl");
		jsrService.save();
	}

}
