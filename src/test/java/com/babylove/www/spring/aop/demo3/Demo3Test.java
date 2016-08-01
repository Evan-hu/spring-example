package com.babylove.www.spring.aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.JUnitBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo3Test extends JUnitBase{
	
	public Demo3Test() {
		super("classpath:/aop/demo3.xml");
	}
	
	
	@Test
	public void testAop() throws Exception{
		//通过Spring配置,beanAspect没有通过显式实现Parent接口，也能转换成Parent对象
		Parent parent = super.getBean("beanAspect");
		parent.log();
	}
}
