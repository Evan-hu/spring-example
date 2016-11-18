package com.babylove.www.springmvc.bind.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * Created by Will.Zhang on 2016/11/18 0018 16:32.
 * 基础数据绑定例子
 */
@Controller
@RequestMapping("/springmvc/bind/demo1")
public class BindDemo1Controller {

    /**
     * 访问地址:http://localhost:8080/springmvc/bind/demo1/bindInt?number=1
     * 当绑定基本数据类型的时候,如果客户端不传值,则会报错
     * 例如
     * springmvc/bind/demo1/bindInt?number=
     * 或者
     * springmvc/bind/demo1/bindInt
     * 请结合实际情况使用
     * @param number
     * @return
     */
    @RequestMapping(value = "/bindInt", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String bindInt(int number){
        return "number:" + number;
    }

    /**
     * 访问地址:http://localhost:8080/springmvc/bind/demo1/bindInteger?number=1
     * 如果绑定包装类型的话,客户端就算不传,也不会报错
     * @param number
     * @return
     */
    @RequestMapping(value = "/bindInteger", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String bindInteger(Integer number){
        return "number:" + number;
    }

    /**
     * 访问地址:http://localhost:8080/springmvc/bind/demo1/bindIntegerByRequire?number=1
     * 当使用了@RequestParam标签,这个时候参数就必须要传了,否则无法进入,当然你也可以设置成false
     * @param number
     * @return
     */
    @RequestMapping(value = "/bindIntegerByRequire", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String bindIntegerByRequire(@RequestParam(value = "number", required = true)Integer number){
        return "number:" + number;
    }

    /**
     * 访问地址:http://localhost:8080/springmvc/bind/demo1/bindArray?name=will&name=jack&name=mike
     * 当然,你可以绑定数组
     * @param name
     * @return
     */
    @RequestMapping(value = "/bindArray", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String bindArray(String[] name){
        return Arrays.toString(name);
    }

}
