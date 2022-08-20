package com.example.springbootdome.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author 申亮
 * createTime 2022年8月20日-22:38:02
 * user 申亮
 * Directory Path 
 * @version info 
 * @author 申亮
 * @serial description
 */

 @RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name) {
        return "Hello World!--- " + name;

    }
}
