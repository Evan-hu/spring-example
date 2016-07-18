package com.babylove.www.spring.aopAndIoc.demo7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babylove.www.spring.aopAndIoc.demo7.dao.InjectionDao;

@Service
public class InjectionServiceImpl implements InjectionService{
	
	/**
	 * 使@Autowired标签,等于传统的setter方法
	 * required=false代表，就是找不到合适的bean,也不会报错
	 */
	@Autowired(required=false)
	private InjectionDao injectionDao;
	
	public InjectionServiceImpl(){
		super();
	}
	
	/**
	 * Autowired标签也可以通过构造器注入
	 * required=false代表，就是找不到合适的bean,也不会报错
	 * 但是每个类只能有一个构造器required可以设置成false
	 * @param injectionDao
	 */
	@Autowired(required=false)
	public InjectionServiceImpl(InjectionDao injectionDao) {
		System.out.println("通过构造器注入方式");
		this.injectionDao = injectionDao;
	}

	public void save(String args) {
		//模拟业务操作
		System.out.println("Service接收参数:" + args);
		args = args + ":" + args.hashCode();
		injectionDao.save(args);
	}
}
