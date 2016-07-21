#spring
用一些简单得例子，让大家了解和明白怎么使用spring的最基本功能

##设置注入和构造器注入
* Spring注入是指在启动Spring容器加载bean配置的时候，完成对变量的赋值行为
* 常用的两种注入方式
	* 设值注入
	* 构造器注入
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo1.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo1)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo1/Test1.java)

##Bean的作用域
* singleton : 单例，指一个Bean容器中只存在一份
* prototype : 每次请求（每次使用）都创建新的实例，destory方式不生效
* 其余作用域本例子中暂无
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo2.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo2)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo2/Demo2Test.java)

##生命周期
* bean的声明周期:
	* 定义
	* 初始化
	* 使用
	* 销毁
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo3.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo3)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo3/Demo3Test.java)

##Aware
* Spring提供了一些以Aware结尾的接口。如果我们实现了这些接口，在初始化的时候，就能获取相应的资源
* 通过实现Aware接口，可以对Spring相应资源进行操作
* 为对Spring进行简单扩展提供了方便入口
* 实现这些接口的类，必须在xml中定义
* ApplicationContextAware : 获取applicationContext
* BeanNameAware : 获取bean的name
* 还有ApplicationEventPublisherAware,BeanClassLoaderAware,BeanFactoryAware,BootstrapContextAware,LoadTimeWeaverAware,MessageSourceAware,
NotificationPublisherAware,PortletConfigAware,PortletContextAware,ResourceLoaderAware,ServletConfigAware,ServletContextAware等
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo4.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo4)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo4/Demo4Test.java)

##Bean的自动装配(Autowiring)
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo5.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo5)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo5/Demo5Test.java)

##@Component,@Repository,@Service,@Controller,@Scope和<context:annotation-config>,<context:component-scan>
* @Component,@Repository,@Service,@Controller这4个标签都是用于标识类，告诉spring它需要被注册
	* @Component是一个通用注解，可以用于任何bean
	* @Repository通常用于注解DAO类
	* @Service通常用于注解Service类
	* @Controller通常用于注解Controller类
	* @Repository,@Service,@Controller都是@Component的子注解,都是基于@Component定义的注解
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo6.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo6)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo6/Demo6Test.java)

##@Autowired
* 可以将@Autowired标签理解为传统的setter方法
* @Autowired标签也可以用于构造器
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo7.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo7)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo7/Demo7Test.java)
* 数组以及Map自动注入以及@Qualifier的使用
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo8.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo8)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo8/Demo8Test.java)

##容器注解
* @Bean和@Configuration
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo9.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo9)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo9/Demo9Test.java)
* @ImportResource和@Value和context:property-placeholder
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo10.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo10)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo10/Demo10Test.java)

##基于泛型的自动装配
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo11.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo11)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo11/Demo11Test.java)

##对JSR的支持
* 对JSR250的支持，使用@Resource,@PostConstruct,@PreDestroy
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo12.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo12)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo12/Demo12Test.java)
* 对JSR330的支持，使用@Named,@Inject
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/ioc/demo13.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/ioc/demo13)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/ioc/demo13/Demo13Test.java)