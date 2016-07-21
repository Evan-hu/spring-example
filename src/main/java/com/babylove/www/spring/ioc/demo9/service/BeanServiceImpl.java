package com.babylove.www.spring.ioc.demo9.service;

public class BeanServiceImpl implements BeanService{
	
	public void init(){
		System.out.println("init");
	}
	
	public void destory(){
		System.out.println("destory");
	}
}
