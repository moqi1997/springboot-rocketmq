package com.moqi.shop.test;

import com.moqi.shop.springboot.rockmq.ProducerApplication;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author moqi
 * @date 2020/3/1 11:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ProducerApplication.class})
@Slf4j
public class ProducerTest {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    @Test
    public void testSendMessage() {
        rocketMQTemplate.convertAndSend("springbooty-rocketmq","hello springboot 12111212");

    }
}
