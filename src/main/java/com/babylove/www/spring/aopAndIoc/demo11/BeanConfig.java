package com.babylove.www.spring.aopAndIoc.demo11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.babylove.www.spring.aopAndIoc.demo11.dao.BeanDao;
import com.babylove.www.spring.aopAndIoc.demo11.dao.BeanDouble1DaoImpl;
import com.babylove.www.spring.aopAndIoc.demo11.dao.BeanInteger1DaoImpl;

@Configuration
public class BeanConfig {
	
	/**
	 * 基于泛型的自动装配
	 * {@link com.babylove.www.spring.aopAndIoc.demo11.dao.BeanDao}接口由2个不同的实现类实现
	 * 由于泛型的不同，@Autowired会根据不同的泛型，自动装配，而不用使用@Qualifier标签
	 * 如果接口存在多个实现，并且是同一泛型，那么要使用@Qualifier
	 * 或者
	 * List<BeanDao<T>>或者Map<String,BeanDao<T>>来实现(基于泛型的自动装配，也支持List和Map)
	 */
	@Autowired
	private BeanDao<Integer> beanDao1;
	
	@Autowired
	private BeanDao<Double> beanDao2;
	
	/**
	 * 输出实现类的名称
	 */
	public void printBean(){
		System.out.println(beanDao1.getClass().getSimpleName());
		System.out.println(beanDao2.getClass().getSimpleName());
	}
	
	/**
	 * bean配置
	 * @return
	 */
	@Bean
	public BeanDao<Integer> beanInteger1(){
		return new BeanInteger1DaoImpl();
	}
	
	@Bean
	public BeanDao<Double> beanDouble1(){
		return new BeanDouble1DaoImpl();
	}
}
