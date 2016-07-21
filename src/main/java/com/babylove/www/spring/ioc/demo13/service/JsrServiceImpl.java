package com.babylove.www.spring.ioc.demo13.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;
import com.babylove.www.spring.ioc.demo13.dao.JsrDao;

/**
 * 标签Named等价于@Component标签
 * 也就是等价于@Service标签
 * @author zhangjiawei
 *
 */
@Named
public class JsrServiceImpl implements JsrService{
	
	/**
	 * spring对jsr330的支持
	 * 可以使用@Inject代替@Autowired
	 * 可以使用与类，属性，方法，构造器上
	 */
	@Inject
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
	 * 标签@Inject也可以用在set方法中
	 * 标签@Named也可以用来指定唯一的实现(如果接口有多个实现的话),类似于@Qualifier
	 */
//	@Inject
//	public void setJsrDao(@Named("jsrDao") JsrDao jsrDao) {
//		this.jsrDao = jsrDao;
//	}

	public void save() {
		jsrDao.save();
	}

}
