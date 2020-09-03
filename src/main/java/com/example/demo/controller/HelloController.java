package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
public class HelloController {


    @CrossOrigin
    @GetMapping(value = "/hello") 
    
    // @ResponseBody
    public String hello(HttpServletRequest request,HttpSession sesssion){
        String str = new String();
        str = str + "loginSessionId:" + request.getSession().getId() + ";";
        str = str + "getRequestURL:" + request.getRequestURL() + ";";
        str = str + "getServerPort:" + request.getServerPort() + ";";
        str = str + "getProtocol:" + request.getProtocol() + ";";

        str = str + "getRemoteAddr:" + request.getRemoteAddr() + ";";
        str = str + "getRemoteHost:" + request.getRemoteHost() + ";";
        str = str + "getRemotePort:" + request.getRemotePort() + ";";
        str = str + "getLocalAddr:" + request.getLocalAddr() + ";";
        str = str + "getLocalName:" + request.getLocalName() + ";";
        str = str + "getLocalPort:" + request.getLocalPort() + ";";   
        return "Hello World wike"+str;
    }
    

}
