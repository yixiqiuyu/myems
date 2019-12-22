package com.gejian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解....");
        return "success";
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(value = "id")String id){
        System.out.println(id);
        return "success";
    }
}
