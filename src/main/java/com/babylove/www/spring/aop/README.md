#前言
* AOP : Aspect Oriented Programming的缩写，意思为：面向切面编程，通过预编译方式和运行时动态代理实现程序功能的统一维护。
* 主要功能：日志记录，性能统计，安全控制，事务处理，异常处理等等

#AOP实现方式
* 预编译
	* AspectJ
* 运行期间动态代理(JDK动态代理，CGLib动态代理)
	* SpringAOP
	* JBossAOP


#配置说明
* Spring 所有的切面和通知器都必须放在<aop:config>内(可以存在多个<aop:config>,每一个<aop:config>可以包含pointcut,advisor和aspect元素(它们必须按照这个顺序进行声明)
* <aop:pointcut>的execution配置说明
	* spring aop和aspectJ都支持
	* execution(public * *(..))切入点为执行所有public方法
	* execution(* set*(..))切入点为执行所有set开头的方法
	* execution(* com.xyz.www.service.UserService.*(..))切入点为执行UserService里面所有的方法
	* execution(* com.xyz.www.service..(..))切入点为service包里面所有类所有方法
	* execution(* com.xyz.www.service...(..))三个点,切入点为service包(以及它的子包)里面所有类所有方法
	* 还有更多的配置方式，或者spring aop自己独有的配置方式，不建议死记，在使用过程中再查阅相关资料

#Advice应用
* 一个基本的aop配置以及<aop:before>,<aop:after-throwing>,aop:after-returning>,<aop:after>使用方法
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/aop/demo1.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/aop/demo1)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/aop/demo1/Demo1Test.java)
* 把参数带到aspect中
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/aop/demo2.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/aop/demo2)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/aop/demo2/Demo2Test.java)

#Introductions
* [xml配置](https://github.com/l81893521/spring-example/tree/master/src/main/resources/aop/demo3.xml)
* [代码](https://github.com/l81893521/spring-example/tree/master/src/main/java/com/babylove/www/spring/aop/demo3)
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/aop/demo3/Demo3Test.java)
