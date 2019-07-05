package com.chand.blog.business.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author Chand
 * @Date: 2019/6/20 15:16
 **/
@RestController
public class TestController {

    @Value("${application.testParam}")
    private String str;

    @RequestMapping(value = "/getString", method = RequestMethod.GET)
    public String getString() {
        return str;
    }
}
