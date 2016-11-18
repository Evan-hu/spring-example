package com.babylove.www.springmvc.bind.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Will.Zhang on 2016/11/18 0018 17:11.
 * 对象数据绑定
 */
@Controller
@RequestMapping("/springmvc/bind/demo2")
public class BindDemo2Controller {

    /**
     * 访问地址:http://localhost:8080/springmvc/bind/demo2/bindUser?name=tom&age=10
     * 当进行对象绑定的时候,参数直接传对象里面的属性即可
     * @param user
     * @return
     */
    @RequestMapping(value = "/bindUser", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String bindUser(User user){
        return user.toString();
    }

    /**
     * 访问地址:http://localhost:8080/springmvc/bind/demo2/bindCar?name=car&price=10&carDetail.description=aaa
     * 当绑定的对象里面,还有另外一个对象,参数里只需要写"对象名.属性名"即可
     * @param car
     * @return
     */
    @RequestMapping(value = "/bindCar", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String bindCar(Car car){
        return car.toString();
    }

    /**
     * http://localhost:8080/springmvc/bind/demo2/bind2User?user.name=tom&user.age=10&user1.name=tony&user1.age=11
     * 当绑定多个对象,并且对象里面的属性一样时,就需要新建2个用来指定对象前缀的方法了
     * 请看initUser和initUser1
     * @param user
     * @param user1
     * @return
     */
    @RequestMapping(value = "/bind2User", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String bind2User(User user, User1 user1){
        return user.toString() + " " + user1.toString();
    }

    @InitBinder("user")
    public void initUser(WebDataBinder binder){
        binder.setFieldDefaultPrefix("user.");
    }

    @InitBinder("user1")
    public void initUser1(WebDataBinder binder){
        binder.setFieldDefaultPrefix("user1.");
    }
}
