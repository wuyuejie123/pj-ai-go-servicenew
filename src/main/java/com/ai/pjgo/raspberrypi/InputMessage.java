package com.ai.pjgo.raspberrypi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hexinxiang
 * <br/>Date: 2022/3/16
 * <br/>Time: 19:48
 */

@RestController
public class InputMessage {


    @PostMapping("/pi/")
    public void  messTest(){

    }

}
