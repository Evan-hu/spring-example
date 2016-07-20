package com.babylove.www.spring.aopAndIoc.demo12;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.UnitTestBase;
import com.babylove.www.spring.aopAndIoc.demo12.serivce.JsrService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo12Test extends UnitTestBase{

	public Demo12Test() {
		super("classpath:/iocAndAop/demo12.xml");
	}
	
	@Test
	public void autowiredTest(){
		JsrService jsrService = super.getBean("jsrServiceImpl");
		jsrService.save();
	}

}
