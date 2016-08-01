package com.babylove.www.spring.aop.demo1.service;

import org.springframework.stereotype.Service;

@Service
public class BeanServiceImpl implements BeanService{

	public void save() throws Exception {
		System.out.println("saved");
//		throw new Exception("exception");
//		throw new RuntimeException("runtime exception");
		
	}

}
