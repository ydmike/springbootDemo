package com.meizikuan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String say(){
        System.out.println("xxxxxxxxxxx");
        return "hello world!";
    }

}
