package com.babylove.www.spring.aopAndIoc.demo10;

/**
 * 模拟数据库驱动管理
 * @author zhangjiawei
 *
 */
public class MyDriverManager {
	
	private String username;
	
	private String password;
	
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
		return "MyDriverManager [username=" + username + ", password=" + password + ", url=" + url + "]";
	}
}
