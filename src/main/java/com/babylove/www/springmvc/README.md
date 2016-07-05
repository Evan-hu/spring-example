#Spring MVC
	MVC是模型(model)－视图(view)－控制器(controller)的缩写,让程序分层，分工合作，又协同工作，常用的框架又struts,spring等
	视图(view):重点关注数据的呈现
	模型(Model):业务数据的表示，关注职称业务信息的构成，通常是多个业务实体的组合
	控制器(controller):调用业务逻辑产生合适的数据(Model),传递数据给视图层(View)用于呈现,是连通它们两的桥梁
	例如前端工程师和后端工程师，它们的工作不会互相干扰，只会各自专注和完成自己的事情，但是又必须协同工作。

##基本概念
下面这几个类是springmvc的核心,大家可以多了解一下
###DispatcherServlet
就是它的前端控制器，浏览器的请求正式通过DispatcherServlet进行分发到达我们一个合适的controller来生产我们需要的业务数据model

model再通过DispatcherServlet传递给view来完成最终的页面呈现.因此springMVC将我们的数据和我们的页面实现的分离，就是通过DispatcherServlet来实现的

###Controller
也就是我们MVC中的C,它就是调用我们的业务逻辑，生成model的地方

###HandlerAdapter
它是在DispatcherServlet内部使用的一个类，它其实就是我们controller的一个表现形式(因为springMVC里面并没有一个类或者接口叫做Controller)


###HandlerInterceptor
interceptor是拦截器的意思，它其实就是在我们需要被拦截的对象前后加入一些"料"

HandlerInterceptor是一个接口，它有3个方法，preHandle,postHandl和afterCompletion

如果你实现了这个接口，就可以在调用controller之前，之后或者页面完成呈现之后做一些事情

###HandlerMapping
就是帮助DispatcherServlet去调用正确的controller(Help DispatcherServlet to get the right controller)

还有就是包裹HandlerInterceptor到controller

###HandlerExecutionChain
就是一个Handler的执行链条

###ModelAndView
SpringMVC中，对Model的一种表现形式,当然还有其他的类如Model,你也可以使用java中的Map来实现这个Model的功能

###View Resolver
试图解析器，它会告诉DispatcherServlet你需要用哪一个试图来进行视图的呈现

###View
负责呈现页面

##例子
	通过一些小例子讲述了一下springmvc的功能
###1.spring-mvc-dispatcher.xml是springmvc的配置，内有详细的解析,包括:
	1.context:annotation-config讲解
	2.context:component-scan讲解
	3.mvc:annotation-driven讲解
	4.mvc:resources讲解
	5.org.springframework.web.servlet.view.InternalResourceViewResolver讲解
###2.`com.babylove.www.springmvc.helloworld`
	一个最简单的springmvc例子
###3.`com.babylove.www.springmvc.mycourse`
	结合controller,service,model模拟一个简单的需求来讲解怎么样去开发我们自己的controller
	1.@Controller标签
	2.类级别和方法级别的@RequestMapping标签
	3.@RequestParam标签
	4.url template(url模板)
	5.@PathVariable标签
	6.mvc:resources和继承WebMvcConfigurerAdapter重写addResourceHandlers方法来处理静态资源
	7.使用传统HttpServletRequest来处理请求
	8.数据绑定
	9.重定向
	10.文件上传
	11.怎么返回json数据
