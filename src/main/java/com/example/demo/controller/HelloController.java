package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
public class HelloController {

    @CrossOrigin
    @GetMapping(value = "/hello")
    // @ResponseBody
    public String hello(){
        return "Hello World1";
    }

}
