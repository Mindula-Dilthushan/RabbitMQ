package com.example.rabbitMQ;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RabbitMqApplication {


	@Profile("usage_message")
	@Bean
	public CommandLineRunner usage(){
		return args -> {
			System.out.println("This app uses Spring Profiles");
		};
	}


	@Profile("!usage_message")
	@Bean
	public CommandLineRunner test(){
		return new RabbitMqRunner();
	}

	public static void main(String[] args) throws Exception{
		SpringApplication.run(RabbitMqApplication.class, args);
	}

}
