package com.babylove.www.spring.aop.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;
import com.babylove.www.spring.aop.demo2.service.BeanService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo2Test extends JUnitBase{
	
	public Demo2Test() {
		super("classpath:/aop/demo2.xml");
	}
	
	
	@Test
	public void testAop() throws Exception{
		BeanService beanService = super.getBean("beanServiceImpl");
		beanService.save("Will",25);
	}
}
