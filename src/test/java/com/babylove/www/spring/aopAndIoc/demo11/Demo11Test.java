package com.babylove.www.spring.aopAndIoc.demo11;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo11Test extends UnitTestBase{

	public Demo11Test() {
		super("classpath:/iocAndAop/demo11.xml");
	}
	
	@Test
	public void autowiredTest(){
		BeanConfig beanConfig = super.getBean("beanConfig");
		beanConfig.printBean();
	}

}
