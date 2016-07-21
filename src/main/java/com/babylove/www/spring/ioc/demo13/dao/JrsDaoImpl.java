package com.babylove.www.spring.ioc.demo13.dao;

import javax.inject.Named;


/**
 * 标签@Named等价于@Component标签
 * 也就是等价于@Repository标签
 * @author zhangjiawei
 *
 */
@Named
public class JrsDaoImpl implements JsrDao{

	public void save() {
		System.out.println("saved");
	}

}
