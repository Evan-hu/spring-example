package com.babylove.www.spring.ioc.demo9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;
import com.babylove.www.spring.ioc.demo9.service.BeanService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo9Test extends JUnitBase{
	
	public Demo9Test() {
		super("classpath:/ioc/demo9.xml");
	}
	
	@Test
	public void testGetBean(){
		BeanService beanService = super.getBean("getBeanService");
		System.out.println(beanService.getClass().hashCode());
		beanService = super.getBean("getBeanService");
		System.out.println(beanService.getClass().hashCode());
		BeanService beanService2 = super.getBean("getBeanService2");
		System.out.println(beanService2.getClass().hashCode());
	}
}
