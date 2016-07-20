package com.babylove.www.spring.aopAndIoc.demo12.serivce;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.babylove.www.spring.aopAndIoc.demo12.dao.JsrDao;

@Service
public class JsrServiceImpl implements JsrService{
	
	/**
	 * spring对jsr250的支持
	 * 可以使用@Resource代替@Autowired
	 */
	@Resource
	private JsrDao jsrDao;
	
	/**
	 * 也可以使用@PostConstruct来设定初始化方法
	 */
	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	
	/**
	 * 使用@PreDestroy来设定销毁方法
	 */
	@PreDestroy
	public void destory(){
		System.out.println("destory");
	}
	
	
	/**
	 * 标签@Resource也可以用在set方法中
	 */
//	@Resource
//	public void setJsrDao(JsrDao jsrDao) {
//		this.jsrDao = jsrDao;
//	}

	public void save() {
		jsrDao.save();
	}

}
