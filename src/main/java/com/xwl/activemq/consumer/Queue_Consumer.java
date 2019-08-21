package com.xwl.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

/**
 * @author xwl
 * @date 2019-08-20 10:56
 * @description 消息消费者
 */
@Component
public class Queue_Consumer {
    @JmsListener(destination = "${myqueue}")
    public void receive(TextMessage textMessage) throws Exception {
        System.out.println("*****消费者收到消息：" + textMessage.getText());
    }
}
