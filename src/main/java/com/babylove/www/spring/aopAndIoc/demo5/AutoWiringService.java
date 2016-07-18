package com.babylove.www.spring.aopAndIoc.demo5;

public class AutoWiringService {
	
	private AutoWiringDao autoWiringDao;
	
	/**
	 * 默认构造方法
	 */
	public AutoWiringService() {
	}
	
	/**
	 * 构造方法
	 * @param autoWiringDao
	 */
	public AutoWiringService(AutoWiringDao autoWiringDao){
		System.out.println("AutoWiringService");
		this.autoWiringDao = autoWiringDao;
	}
	
	/**
	 * 普通方法
	 * @param word
	 */
	public void say(String word){
		autoWiringDao.say(word);
	}
	
	/**
	 * set方法
	 * @param autoWiringDao
	 */
	public void setAutoWiringDao(AutoWiringDao autoWiringDao) {
		this.autoWiringDao = autoWiringDao;
	}
}
