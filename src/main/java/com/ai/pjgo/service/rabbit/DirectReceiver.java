package com.ai.pjgo.service.rabbit;

import com.ai.pjgo.pojo.MessTest;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author hexinxiang
 * <br/>Date: 2022/3/20
 * <br/>Time: 12:38
 */

//@Component
//@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
//public class DirectReceiver {
//
//    @RabbitHandler
//    public void process(Map messTest) {
//        System.out.println("DirectReceiver消费者收到消息  : " + messTest);
//    }
//
//}
