package com.example.spring_hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/welcome")
    public String ok(){
        return "Hello world";
    }
}
