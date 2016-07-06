#java-example
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
* [测试入口](https://github.com/l81893521/spring-example/blob/master/src/test/java/com/babylove/www/spring/aopAndIoc/demo2/Demo3Test.java)
