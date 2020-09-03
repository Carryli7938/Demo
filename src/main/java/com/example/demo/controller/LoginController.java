package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.example.demo.pojo.User;
import com.example.demo.result.Result;

@Controller
public class LoginController {

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser,HttpServletRequest request,HttpSession session) {
    // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        
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

            
        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
            String message = "账号密码错误";
            System.out.println("test");
            System.out.println("sessionID3:"+session.getId());
            return new Result(400,str);
        } else {
            System.out.println("sessionID1:"+session.getId());
            System.out.println("sessionID2:"+request.getSession().getId());
            return new Result(200,str);
        }
    }
}

