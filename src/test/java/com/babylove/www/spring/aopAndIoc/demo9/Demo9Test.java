package com.babylove.www.spring.aopAndIoc.demo9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.UnitTestBase;
import com.babylove.www.spring.aopAndIoc.demo9.service.BeanService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo9Test extends UnitTestBase{
	
	public Demo9Test() {
		super("classpath:/iocAndAop/demo9.xml");
	}
	
	@Test
	public void testGetBean(){
		BeanService beanService = super.getBean("getBeanService");
		System.out.println(beanService.getClass().hashCode());
		BeanService beanService1 = super.getBean("getBeanService");
		System.out.println(beanService1.getClass().hashCode());
		BeanService beanService2 = super.getBean("getBeanService2");
	}
}
