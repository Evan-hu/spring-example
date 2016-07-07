#spring
用一些简单得例子，让大家了解和明白怎么使用spring的最基本功能

##设置注入和构造器注入
* Spring注入是指在启动Spring容器加载bean配置的时候，完成对变量的赋值行为
* 常用的两种注入方式
	* 设值注入
	* 构造器注入
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/iocAndAop/demo1.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/aopAndIoc/demo1)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/aopAndIoc/demo1/Test1.java)

##Bean的作用域
* singleton : 单例，指一个Bean容器中只存在一份
* prototype : 每次请求（每次使用）都创建新的实例，destory方式不生效
* 其余作用域本例子中暂无
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/iocAndAop/demo2.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/aopAndIoc/demo2)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/aopAndIoc/demo2/Demo2Test.java)

##生命周期
* bean的声明周期:
	* 定义
	* 初始化
	* 使用
	* 销毁
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/iocAndAop/demo3.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/aopAndIoc/demo3)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/aopAndIoc/demo3/Demo3Test.java)

##Aware
* Spring提供了一些以Aware结尾的接口。如果我们实现了这些接口，在初始化的时候，就能获取相应的资源
* 通过实现Aware接口，可以对Spring相应资源进行操作
* 为对Spring进行简单扩展提供了方便入口
* 实现这些接口的类，必须在xml中定义
* ApplicationContextAware : 获取applicationContext
* BeanNameAware : 获取bean的name
* 还有ApplicationEventPublisherAware,BeanClassLoaderAware,BeanFactoryAware,BootstrapContextAware,LoadTimeWeaverAware,MessageSourceAware,
NotificationPublisherAware,PortletConfigAware,PortletContextAware,ResourceLoaderAware,ServletConfigAware,ServletContextAware等
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/iocAndAop/demo4.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/aopAndIoc/demo4)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/aopAndIoc/demo4/Demo4Test.java)

##Bean的自动装配(Autowiring)
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/iocAndAop/demo5.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/aopAndIoc/demo5)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/aopAndIoc/demo5/Demo5Test.java)
