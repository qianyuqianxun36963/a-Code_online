package com.neo.service.receiver;

import com.neo.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Component
@RabbitListener(queues = "hi")
public class ReceiveHiService {

    @RabbitHandler
    public void process(String hello) throws Exception {
        sleep(3000);
        System.out.println("Receive from queue hi  : " + hello);
    }

    @RabbitHandler
    public void process(User user) {
        System.out.println("Receive from queue hi  : " + user);
    }

}
