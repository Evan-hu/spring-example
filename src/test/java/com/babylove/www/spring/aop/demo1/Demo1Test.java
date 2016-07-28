package com.babylove.www.spring.aop.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;
import com.babylove.www.spring.aop.demo1.service.BeanService;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo1Test extends JUnitBase{
	
	public Demo1Test() {
		super("classpath:/aop/demo1.xml");
	}
	
	
	@Test
	public void testAop() throws Exception{
		/*
		 * 分别配置了，前置通知，环绕通知，后置通知，返回后通知以及异常通知(需要把beanServiceImpl抛出异常的代码取消注释)
		 * 我们可以看看它们的执行顺序
		 */
		BeanService beanService = super.getBean("beanServiceImpl");
		beanService.save();
	}
}
