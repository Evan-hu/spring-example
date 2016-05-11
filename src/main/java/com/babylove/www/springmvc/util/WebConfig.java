package com.babylove.www.springmvc.util;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{
	/**
	 * 处理我们的静态资源
	 * 可以控制缓存时间
	 * 等同于
	 * <mvc:resources mapping="/resources/**" location="/resources/" >
	 * 	<mvc:cache-control max-age="3600" cache-public="true"/>
	 * </mvc:resources>
	 * 详见spring官方文档21.14.2
	 */
//	@Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**")
//        	.addResourceLocations("/resources/")
//        	.setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS).cachePublic());;
//    }
	
	/**
	 * 等同于
	 * <bean id="jspViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	 *  <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
	 *  <property name="prefix" value="/WEB-INF/jsp/"/>
	 *  <property name="suffix" value=".jsp"/>
	 * </bean>
	 * 或者
	 * <mvc:view-resolvers>
	 *  <mvc:jsp prefix="/WEB-INF/jsp/" suffix=".jsp"/>
	 * </mvc:view-resolvers>
	 */
//	@Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.jsp("/WEB-INF/jsp/", ".jsp");
//    }
}
