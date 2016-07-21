package com.babylove.www.spring.ioc.demo2;

public class BeanScopeBySingleton {
	
	public void say(){
		System.out.println(this.getClass().getSimpleName() + ":" + this.hashCode());
	}
}
