package com.babylove.www.spring.aop.demo5.service;

import org.springframework.stereotype.Service;

@Service
public class BeanServiceImpl implements BeanService{

	public void save(){
		System.out.println("saved");
//		throw new RuntimeException();
	}
	
	public void update(){
		System.out.println("updated");
	}

}
