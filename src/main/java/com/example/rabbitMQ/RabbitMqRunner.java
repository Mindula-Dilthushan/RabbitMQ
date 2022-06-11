package com.example.rabbitMQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

public class RabbitMqRunner implements CommandLineRunner {

    @Value("${test.client.duration:0}")
    private int duration;

    @Autowired
    private ConfigurableApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ready..... " + duration + "ms");
        Thread.sleep(duration);
        context.close();
    }
}
