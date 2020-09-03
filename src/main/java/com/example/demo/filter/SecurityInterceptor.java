package com.example.demo.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Component
public class SecurityInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        // Cookie[] cookies = request.getCookies();
        //
        // if (cookies != null) {
        // Cookie cookie = cookies[0];
        // if (cookie != null) {
        // String value = cookie.getValue();
        //
        // String builder = ("JSESSIONID=" + value + "; ") +
        // "Secure; " +
        // "HttpOnly; ";
        // response.setHeader("Set-Cookie", builder);
        // }
        // }
        //
        // //根据session判断用户是否登录
        // String url = request.getRequestURI();
        // if (!"/api/assetDetails/psAssetAudit".equals(url)) {
        // if (request.getSession().getAttribute("user") == null) {
        // response.setCharacterEncoding("UTF-8");
        // response.setContentType("application/json; charset=utf-8");
        // PrintWriter out = null;
        // try {
        // JSONObject res = new JSONObject();
        // res.put("success", false);
        // res.put("message", "用户未登录！");
        // out = response.getWriter();
        // out.append(res.toString());
        // return false;
        // } catch (Exception e) {
        // e.printStackTrace();
        // response.sendError(500);
        // return false;
        // }
        // }
        // }

        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));//支持跨域请求
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "0");
        response.setHeader("Access-Control-Allow-Headers",
                "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token,Access-Control-Allow-Headers");
        response.setHeader("Access-Control-Allow-Credentials", "true");//是否支持cookie跨域
        response.setHeader("XDomainRequestAllowed", "1");
        return true;
    }
}
