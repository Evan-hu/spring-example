package com.babylove.www.spring.ioc.demo12;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;
import com.babylove.www.spring.ioc.demo12.serivce.JsrService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo12Test extends JUnitBase{

	public Demo12Test() {
		super("classpath:/ioc/demo12.xml");
	}
	
	@Test
	public void autowiredTest(){
		JsrService jsrService = super.getBean("jsrServiceImpl");
		jsrService.save();
	}

}
