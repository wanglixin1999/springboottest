package com.example.springboottest.controller;

/**
 * Created by wanglixin
 * 2019/12/17 5:33 PM
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/hello"})
public class HelloController {

    @RequestMapping(value = {"/springboot"})
    public String hello() {
        return "HelloWord";
    }
}
