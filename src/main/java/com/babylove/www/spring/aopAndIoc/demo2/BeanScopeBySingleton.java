package com.babylove.www.spring.aopAndIoc.demo2;

public class BeanScopeBySingleton {
	
	public void say(){
		System.out.println(this.getClass().getSimpleName() + ":" + this.hashCode());
	}
}
