package com.example.rabbitMQ.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hello")
public class Test1Receiver {

    @RabbitHandler
    public void receive(String string){
        System.out.println(" [x] Received '" + string + "'");
    }

}
