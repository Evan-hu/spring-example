package com.babylove.www.spring.aopAndIoc.demo10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 模拟数据库驱动管理
 * @author zhangjiawei
 *
 */
@Configuration
@ImportResource("classpath:/iocAndAop/demo10.xml")
public class MyDriverManager2 {
	
	@Value(value="${jdbc.username}")
	private String username;
	
	@Value(value="${jdbc.password}")
	private String password;
	
	@Value(value="${jdbc.url}")
	private String url;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "MyDriverManager2 [username=" + username + ", password=" + password + ", url=" + url + "]";
	}
}
