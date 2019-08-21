package com.xwl.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @author xwl
 * @date 2019-08-19 17:15
 * @description
 */
@Component
@EnableJms // 开启jms适配的注解
public class ConfigBean {
    @Value("${myqueue}")
    private String myQueue;

    @Value("${mytopic}")
    private String myTopic;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(myQueue);
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic(myTopic);
    }
}
