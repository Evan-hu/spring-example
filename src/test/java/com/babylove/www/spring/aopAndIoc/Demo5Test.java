package com.babylove.www.spring.aopAndIoc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.UnitTestBase;
import com.babylove.www.spring.aopAndIoc.demo5.AutoWiringService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo5Test extends UnitTestBase{

	public Demo5Test() {
		super("classpath:/iocAndAop/demo5.xml");
	}
	
	/**
	 * 运行入口
	 */
	@Test
	public void testAutoWiring(){
		AutoWiringService autoWiringService = super.getBean("autoWiringService");
		autoWiringService.say("hello!");
	}

}
