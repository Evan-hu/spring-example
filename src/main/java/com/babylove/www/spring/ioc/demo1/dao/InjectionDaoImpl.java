package com.babylove.www.spring.ioc.demo1.dao;

public class InjectionDaoImpl implements InjectionDao{

	public void save(String args) {
		//模拟数据库保存操作
		System.out.println("保存数据:" + args);
	}

}
