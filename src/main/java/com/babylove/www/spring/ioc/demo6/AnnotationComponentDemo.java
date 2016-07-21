package com.babylove.www.spring.ioc.demo6;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
/**
 * 
 * Component,Resository,Service,Controller四个标签中
 * 都有一个name属性，用于显示指定bean的名称(也就是以前xml中bean的id)
 * 如果不指定的情况下，默认由BeanNameGenerator生成，默认名称为类名，首字母小写
 * 也可以自定义bean命名策略，实现BeanNameGenerator接口,需要包含一个无参构造函数
 * 然后配置<context:component-san base-package="扫描的包路径" name-generator="你自己实现了BeanNameGenerator接口的类"/>
 * 
 * 
 * Scope标签，等同于以前bean的scope属性
 * 默认还是singleton
 * 也可以自定义scope策略，实现ScopeMetadataResolver接口，需要包含一个无参构造函数
 * 然后配置<context:component-san base-package="扫描的包路径" scope-resolver="你自己实现了ScopeMetadataResolver接口的类"/>
 * 
 * @author zhangjiawei
 *
 */
@Component
@Scope
public class AnnotationComponentDemo{

	public void say(String word){
		System.out.println(word);
	}
	
	public void myHex(){
		System.out.println("AnnotationComponentDemo:" + this.hashCode());
	}
}

/**
 * 
 * @author zhangjiawei
 *
 */
@Repository
@Scope(value="prototype")
class AnnotationRepositoryDemo{
	
	public void say(String word){
		System.out.println(word);
	}
	
	public void myHex(){
		System.out.println("AnnotationRepositoryDemo:" + this.hashCode());
	}
}

/**
 * 
 * @author zhangjiawei
 *
 */
@Service
@Scope
class AnnotationServiceDemo{
	public void say(String word){
		System.out.println(word);
	}
	
	public void myHex(){
		System.out.println("AnnotationServiceDemo:" + this.hashCode());
	}
}

/**
 * 
 * @author zhangjiawei
 *
 */
@Controller
@Scope(value="prototype")
class AnnotationControllerDemo{
	
	public void say(String word){
		System.out.println(word);
	}
	
	public void myHex(){
		System.out.println("AnnotationControllerDemo:" + this.hashCode());
	}
}
