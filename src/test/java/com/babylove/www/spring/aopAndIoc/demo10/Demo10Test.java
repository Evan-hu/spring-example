package com.babylove.www.spring.aopAndIoc.demo10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.UnitTestBase;
@RunWith(BlockJUnit4ClassRunner.class)
public class Demo10Test extends UnitTestBase{

	public Demo10Test() {
		super("classpath:/iocAndAop/demo10.xml");
	}
	
	@Test
	public void testGetDriverManager(){
		/**
		 * 在xml中配置的值
		 */
		MyDriverManager myDriverManager = super.getBean("myDriverManager");
		System.out.println(myDriverManager.toString());
		/**
		 * 始终@ImportResource和@Value配置的值
		 */
		MyDriverManager2 myDriverManager2 = super.getBean("myDriverManager2");
		System.out.println(myDriverManager2.toString());
	}

}
