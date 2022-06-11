package com.example.rabbitMQ.test;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Profile({"test1","hello-world"})
@Configuration
public class TestConfig {

    @Bean
    public Queue hello(){
        return new Queue("Hello");
    }

    @Profile("receiver")
    @Bean
    public Test1Receiver receiver() {
        return new Test1Receiver();
    }

    @Profile("sender")
    @Bean
    public Test1Sender sender(){
        return new Test1Sender();
    }
}
