package com.mknow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/admin.do")
    public String login() {
        System.out.println("hello world !");

        return "你好啊！";
    }

}
