package com.babylove.www.spring.aopAndIoc.demo8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.UnitTestBase;
import com.babylove.www.spring.aopAndIoc.demo8.service.BeanService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo8Test extends UnitTestBase{

	public Demo8Test() {
		super("classpath:/iocAndAop/demo8.xml");
	}
	
	@Test
	public void autowiredTest(){
		BeanService beanService = super.getBean("beanService");
		beanService.printList();
		beanService.printMap();
		beanService.printBean();
	}

}
