package com.ai.pjgo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

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


    @RequestMapping("/login")
    public String test2(String username, String password, HttpServletResponse rsp){


        String mess="no";
        String token="0";
        if (username.equals(password)){
            mess="yes";
            token="123";
        }else {
            mess="no";
            token="000";
        }

        rsp.setHeader("token",token);

        return mess;
    }



}
