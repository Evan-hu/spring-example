package com.babylove.www.spring.ioc.demo12.dao;

import org.springframework.stereotype.Repository;

@Repository
public class JrsDaoImpl implements JsrDao{

	public void save() {
		System.out.println("saved");
	}

}
