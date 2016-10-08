package com.babylove.www.spring.aop.demo5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;
import com.babylove.www.spring.aop.demo5.service.BeanService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo5Test extends JUnitBase{
	
	public Demo5Test() {
		super("classpath:/aop/demo5.xml");
	}
	
	
	@Test
	public void testAop() throws Exception{
		BeanService beanService = super.getBean("beanService");
		beanService.save();
		beanService.update();
	}
}
