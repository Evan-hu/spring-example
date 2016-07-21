package com.babylove.www.spring.ioc.demo8.dao;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 实现了BeanInterface接口
 * 标签@Order的使用效果，请查看{@link com.babylove.www.spring.aopAndIoc.demo8.service.BeanService}的注释
 * @author zhangjiawei
 *
 */
@Order(value = 1)
@Component
public class BeanOneDaoImpl implements BeanDao{

}
