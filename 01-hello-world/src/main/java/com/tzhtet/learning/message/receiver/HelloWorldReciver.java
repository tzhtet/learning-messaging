package com.tzhtet.learning.message.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RabbitListener(queues = "hello")
public class HelloWorldReciver {
	
	@RabbitHandler
	public void handle(String message) {
		log.info(message);
	}

}
