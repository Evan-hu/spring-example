package com.babylove.www.spring.aopAndIoc.demo6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.babylove.www.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class Demo6Test extends UnitTestBase{

	public Demo6Test() {
		super("classpath:/iocAndAop/demo6.xml");
	}
	
	/**
	 * 测试Component,Resository,Service,Controller四个标签
	 */
	@Test
	public void testAnnotaion(){
		AnnotationComponentDemo annotationComponentDemo = super.getBean("annotationComponentDemo");
		annotationComponentDemo.say("This is a component annotation test");
		
		AnnotationRepositoryDemo annotationRepositoryDemo = super.getBean("annotationRepositoryDemo");
		annotationRepositoryDemo.say("This is a repository annotation test");
		
		AnnotationServiceDemo annotationServiceDemo = super.getBean("annotationServiceDemo");
		annotationServiceDemo.say("This is a repository annotation test");
		
		AnnotationControllerDemo annotationControllerDemo = super.getBean("annotationControllerDemo");
		annotationControllerDemo.say("This is a controller annotation test");
	}
	
	/**
	 * 测试Scope标签
	 */
	@Test
	public void testScope(){
		AnnotationComponentDemo component1 = super.getBean("annotationComponentDemo");
		component1.myHex();
		AnnotationComponentDemo component2 = super.getBean("annotationComponentDemo");
		component2.myHex();
		
		AnnotationRepositoryDemo repository1 = super.getBean("annotationRepositoryDemo");
		repository1.myHex();
		AnnotationRepositoryDemo repository2 = super.getBean("annotationRepositoryDemo");
		repository2.myHex();
	}

}
