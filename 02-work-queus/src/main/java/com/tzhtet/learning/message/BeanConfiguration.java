package com.tzhtet.learning.message;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tzhtet.learning.message.service.MessageReceiver;

@Configuration
public class BeanConfiguration {
	
	@Bean
	Queue queue() {
		return new Queue("hello");
	}
	
	@Bean
	MessageReceiver receiver1() {
		return new MessageReceiver(1);
	}
	

}
