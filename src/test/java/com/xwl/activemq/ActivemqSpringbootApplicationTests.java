package com.xwl.activemq;

import com.xwl.activemq.produce.Queue_Produce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ActivemqSpringbootApplication.class)
@WebAppConfiguration
public class ActivemqSpringbootApplicationTests {

//    @Autowired // 注：@Autowired是spring的注解
    @Resource // 注：@Resource是java的注解
    private Queue_Produce queue_produce;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSend() throws Exception {
        queue_produce.produceMsg();
    }

}
