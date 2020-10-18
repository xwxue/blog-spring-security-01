package com.keepzing.security.controller;

import com.keepzing.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
       return "hello, spring security!";
    }
}
