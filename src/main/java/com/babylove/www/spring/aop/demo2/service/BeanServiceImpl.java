package com.babylove.www.spring.aop.demo2.service;

import org.springframework.stereotype.Service;

@Service
public class BeanServiceImpl implements BeanService{

	public void save(String name, int age) throws Exception {
		System.out.println("name="+name+",age="+age);
	}

}
