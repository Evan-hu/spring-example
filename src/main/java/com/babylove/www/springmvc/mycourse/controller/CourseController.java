package com.babylove.www.springmvc.mycourse.controller;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.babylove.www.springmvc.mycourse.model.Course;
import com.babylove.www.springmvc.mycourse.service.CourseService;

/**
 * 使用@Controller标签把我们的类标示为Controller
 * 它会被Spring dispatcherServlet的上下文所管理
 * 并且完成它的依赖注入
 * 
 * 使用类级别的@RequestMapping来设置，通过什么访问路径，可以进入到这个类
 * @author zhangjiawei
 *
 */
@Controller
@RequestMapping("/springmvc/mycourse/course")
public class CourseController {
	
	private static Logger log = LoggerFactory.getLogger(CourseController.class);
	
	@Autowired
	private CourseService courseService;
	
	/**
	 * 这是方法级别的@RequestMapping
	 * 它将会结合类级别的@RequestMapping一起工作，构造出怎么访问一个类里面的一个特定方法
	 * 例如/springmvc/mycourse/course/view?courseId=123将会访问到CourseController里面的viewCourse方法
	 * 同时还可以指定method,method=RequestMethod.GET表示这个方法只能够被get请求所访问
	 * 
	 * 这个标签@RequestParam可以把前端传进来的参数，绑定到我们的属性当中
	 * 例如@RequestParam("abcd")Integer courseId
	 * 那么url为springmvc/mycourse/course/view?abcd=123
	 * 到请求到达这个方法的时候，我们的属性courseId的值就是123了
	 * 
	 * 访问地址:http://127.0.0.1:8080/spring-example/springmvc/mycourse/course/view?courseId=123
	 * 
	 * @param courseId
	 * @param model Springmvc中model有3种表现形式org.springframework.ui.Model就是其中一种
	 * @return
	 */
	@RequestMapping(value="view",method=RequestMethod.GET)
	public String viewCourse(@RequestParam("courseId")Integer courseId, Model model){
		log.debug("成功进入到viewCourse啦!!!!!courseId={}",courseId);
		Course course = courseService.getCoursebyId(courseId);
		//把course放到model,key默认就是course
		model.addAttribute(course);
		model.addAttribute("course", course);
		model.addAttribute("t", new Date());
		return "springmvc/mycourse/course_overview";
	}
	
	/**
	 * 有的人说用问号传参这种形式url形式太老土了
	 * 那我们来试试restful的url风格
	 * 这次@RequestMapping的value写成view2/{courseId},注意哦{courseId}是由花括号包起来，代表了我们使用url模板
	 * 同时我们使用@PathVariable来指定courseId的名称,这样他们就能绑定上了
	 * 详情请查看spring官方文档URI Template Patterns章节
	 * 
	 * 这次这样访问就可以咯http://127.0.0.1:8080/spring-example/springmvc/mycourse/course/view2/345
	 * @param courseId
	 * @param map Springmvc中model有3种表现形式Map也是其中一种
	 * @return
	 */
	@RequestMapping(value="view2/{courseId}",method=RequestMethod.GET)
	public String viewCourse2(@PathVariable("courseId")Integer courseId, Map<String, Object> map){
		log.debug("成功进入到viewCourse2啦!!!!!courseId={}",courseId);
		Course course = courseService.getCoursebyId(courseId);
		map.put("course", course);
		return "springmvc/mycourse/course_overview";
	}
	
	/**
	 * 这次我们使用传统的老式方法HttpServletRequest来处理这个请求
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value="view3",method=RequestMethod.GET)
	public String viewCourse3(HttpServletRequest request){
		Integer courseId = Integer.parseInt(request.getParameter("courseId"));
		Course course = courseService.getCoursebyId(courseId);
		request.setAttribute("course", course);
		return "springmvc/mycourse/course_overview";
	}
	
	/**
	 * 跳转到添加页面
	 * 访问地址:http://127.0.0.1:8080/spring-example/springmvc/mycourse/course/admin?add
	 * @return
	 */
	@RequestMapping(value="admin",method=RequestMethod.GET,params="add")
	public String addCourse(){
		return "springmvc/mycourse/edit";
	}
	
	/**
	 * 添加课程
	 * 讲解一下什么是数据绑定
	 * 数据绑定，就是将请求中的字段，按照名字匹配的原则，填入到对象模型
	 * 通常在前台，一些添加功能中，都是由html的input标签组成各种零散的文本框供用户填写
	 * 当点击保存的时候，数据来到我们的后台，如何将这些零散的数据自动放入到我们的java对象当中
	 * 
	 * 当我们在springMVC里面做重定向，只需要在return的字符串里面加上redirect:+路径即可
	 * @return
	 */
	@RequestMapping(value="save",method=RequestMethod.POST)
	//使用@ModelAttribute标签也可，它拥有更多高级功能
	public String save(@ModelAttribute Course course){
//	public String save(Course course){
		log.debug("info of course:");
		//ReflectionToStringBuilder是commons lang里面的一个类，在日志输出调试的时候非常常用
		log.debug(ReflectionToStringBuilder.toString(course));
		//做一些业务操作，比如数据持久化
		
		
		course.setCourseId(123);
		return "redirect:view2/" + course.getCourseId();
	}
	
	/**
	 * 跳转到上传页面地址
	 */
	@RequestMapping(value="upload",method=RequestMethod.GET)
	public String showUpdatePage(){
		return "springmvc/mycourse/file";
	}
	
	/**
	 * 上传文件
	 * 我们使用MultipartFile或者MultipartHttpServletRequest来接收上传的文件
	 * 非常方便，无需做任何操作就能接收到文件
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="doUpload",method=RequestMethod.POST)
	public String doUploadFile(@RequestParam("file")MultipartFile file) throws IOException{
		//做一些业务操作
		if(!file.isEmpty()){
			log.debug("成功接收到文件啦:{}",file.getOriginalFilename());
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("/Users/zhangjiawei/a.java"));
		}
		return "springmvc/mycourse/success";
	}
	
	/**
	 * 这个例子我们讲一下怎么去返回json数据
	 * 首先请去看一下spring-mvc-dispatcher.xml的ContentNegotiatingViewResolver配置
	 * 这里我们使用了@ResponseBody标签,它表示将返回内容直接显示在页面上,它跟@RequestBody非常相似
	 * 例如我们return "hello",那么这个时候就不是跳转到hello.jsp,而是直接在页面上显示hello这几个字符
	 * 
	 * 这里我们配合spring-mvcdispatcher.xml的配置MappingJackson2JsonView,就能够把对象转成json格式的字符串并且返回
	 * 
	 * 访问地址:http://127.0.0.1:8080/spring-example/springmvc/mycourse/course/jsonview/123
	 * @param courseId
	 * @return
	 */
	@RequestMapping(value="jsonview/{courseId}")
	@ResponseBody
	public Course getCourseInJson(@PathVariable Integer courseId){
		return courseService.getCoursebyId(courseId);
	}
	
	/**
	 * ResponseEntity它是springmvc里面的一个类，它的父类是HttpEntity(当然你可以使用HttpEntity)
	 * 它跟@RequestBody和@ResponseBody也是非常相似
	 * 
	 * 功能一样是直接将对象直接写入响应流,而不是跳转页面(当然我们这里在配置里面使用了MappingJackson2JsonView,所以会先把对象转成json,再返回)
	 * 这是另外一种返回Json的方法
	 * @param courseId
	 * @return
	 */
	@RequestMapping(value="jsonview2/{courseId}")
	public ResponseEntity<Course> getCouseInJson2(@PathVariable Integer courseId){
		Course course = courseService.getCoursebyId(courseId);
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}
}