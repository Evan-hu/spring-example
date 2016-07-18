package com.babylove.www.spring.aopAndIoc.demo8.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.babylove.www.spring.aopAndIoc.demo8.dao.BeanDao;

@Component
public class BeanService {
	
	/**
	 * 实现了BeanDao的接口将会自动被注入
	 * 如果希望列表有序，可以在接口的实现类上，使用@Order标签,value=序列值
	 * 或者实现{@link org.springframework.core.Ordered}接口
	 */
	@Autowired
	private List<BeanDao> list;
	
	/**
	 * 实现了BeanDao的接口将会自动被注入
	 * key=bean的id
	 * 标签@Order对map不生效哦
	 */
	@Autowired
	private Map<String, BeanDao> map;
	
	public void printList(){
		for(BeanDao beanDao : list){
			System.out.println(beanDao.getClass().getSimpleName());
		}
	}
	
	public void printMap(){
		for(Map.Entry<String, BeanDao> entry : map.entrySet()){
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
	}
}
