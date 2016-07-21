package com.babylove.www.spring.ioc.demo9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.babylove.www.spring.ioc.demo9.service.BeanService;
import com.babylove.www.spring.ioc.demo9.service.BeanServiceImpl;

/**
 * 标识为配置
 * 和@bean搭配使用
 * @author zhangjiawei
 *
 */
@Configuration
public class BeanConfig {
	
	/**
	 * 标签@bean类似于配置文件的</bean>
	 * 它的name属性，可以手动指定bean的id,否则默认为方法的名称
	 * 默认是单例，无论你拿多少次，都是同一个对象
	 * @return
	 */
	@Bean
	public BeanService getBeanService(){
		return new BeanServiceImpl();
	}
	
	/**
	 * 也可以配置初始化和销毁方法
	 * @return
	 */
	@Bean(initMethod="init",destroyMethod="destory")
	public BeanService getBeanService2(){
		return new BeanServiceImpl();
	}
}
