package com.xwl.activemq.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;

/**
 * @author xwl
 * @date 2019-08-19 17:26
 * @description 消息生产者
 */
@Component
public class Queue_Produce {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void produceMsg() {
        jmsMessagingTemplate.convertAndSend(queue, "*****：" + UUID.randomUUID().toString().substring(0, 6));
    }

    /**
     * 间隔时间3s定投
     */
    @Scheduled(fixedDelay = 3000) // 使用此注解需要在主启动类中加入@EnableScheduling注解开启此功能
    public void produceMsgSecheduled() {
        jmsMessagingTemplate.convertAndSend(queue, "*****scheduled：" + UUID.randomUUID().toString().substring(0, 6));
        System.out.println("*****produceMsgSecheduled send ok");
    }
}
