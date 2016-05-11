package com.babylove.www.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc/helloWorld/hellowWorld")
public class HelloWorldController {
	
	/**
	 * 访问springmvc/helloWorld/hello可以放到这个方法
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(){
		return "springmvc/helloworld/hello";
	}
}
