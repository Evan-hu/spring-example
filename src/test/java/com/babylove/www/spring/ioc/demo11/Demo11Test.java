package com.babylove.www.spring.ioc.demo11;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo11Test extends JUnitBase{

	public Demo11Test() {
		super("classpath:/ioc/demo11.xml");
	}
	
	@Test
	public void autowiredTest(){
		BeanConfig beanConfig = super.getBean("beanConfig");
		beanConfig.printBean();
	}

}
