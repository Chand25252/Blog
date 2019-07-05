package com.chand.blog.resource.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description
 *
 * @author Chand
 * @Date: 2019/6/20 11:37
 **/
@Component
@FeignClient(name = "blog-business")
public interface HelloService {

    @RequestMapping("/getString")
    String helloSome();

}
