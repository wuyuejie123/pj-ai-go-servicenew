package com.ai.pjgo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author hexinxiang
 * <br/>Date: 2022/2/26
 * <br/>Time: 17:30
 */

@ResponseBody
@RequestMapping("/heihe")
@Controller
public class TestCon {



    @RequestMapping("/test")
    public String test1(){

        return "你牛鼻！";
    }


    @CrossOrigin(origins = "http://localhost:9527",allowCredentials = "true")
    @RequestMapping("/login")
    public Object login(String username, String password, HttpServletResponse rsp){


        String mess;
        String token;
        if (username.equals(password)){
            mess="yes";
            token="123";
        }else {
            mess="no";
            token="000";
        }

        rsp.setHeader("token",token);
        rsp.setHeader("code","20000");

        Map<String,Object> data=new LinkedHashMap<>();

        data.put("data",mess);
        data.put("roles", Arrays.asList("user","admin"));
        data.put("name","zhangSan");
        data.put("introduction","测试前后端通路");

        return data;
    }

    @RequestMapping("/user/info")
    public Object getInfo(String token){

        Map<String,Object> mess=new LinkedHashMap<>();
        mess.put("token",token+new Date().getTime());

        return mess;
    }



}
