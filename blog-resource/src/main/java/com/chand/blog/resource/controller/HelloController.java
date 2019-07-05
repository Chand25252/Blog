package com.chand.blog.resource.controller;

import com.chand.blog.resource.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author Chand
 * @Date: 2019/6/20 15:10
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/helloSome", method = RequestMethod.GET)
    public String helloSome() {
        return helloService.helloSome();
    }
}
