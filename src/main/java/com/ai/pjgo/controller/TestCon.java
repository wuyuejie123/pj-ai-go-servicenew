package com.ai.pjgo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hexinxiang
 * <br/>Date: 2022/2/26
 * <br/>Time: 17:30
 */


@Controller
public class TestCon {


    @ResponseBody
    @RequestMapping("/test")
    public String test1(){

        return "你牛鼻！";
    }
}
