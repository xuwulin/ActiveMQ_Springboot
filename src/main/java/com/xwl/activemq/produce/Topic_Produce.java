package com.xwl.activemq.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import javax.jms.Topic;
import java.util.Date;
import java.util.UUID;

/**
 * @author xwl
 * @date 2019-08-20 11:06
 * @description
 */
public class Topic_Produce {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Topic topic;

    @Scheduled(fixedDelay = 3000)
    public void produceTopic() {
        jmsMessagingTemplate.convertAndSend(topic, "主题消息：" + UUID.randomUUID().toString().substring(0, 6));
    }
}
