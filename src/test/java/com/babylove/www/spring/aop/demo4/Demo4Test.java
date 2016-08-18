package com.babylove.www.spring.aop.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;
import com.babylove.www.spring.aop.demo4.service.BeanService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo4Test extends JUnitBase{
	
	public Demo4Test() {
		super("classpath:/aop/demo4.xml");
	}
	
	
	@Test
	public void testAop() throws Exception{
		BeanService beanService = super.getBean("beanService");
		beanService.save();
	}
}
