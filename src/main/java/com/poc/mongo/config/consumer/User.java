package com.poc.mongo.config.consumer;

import com.poc.mongo.config.constants.Constants;
import com.poc.mongo.model.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

	@RabbitListener(queues = Constants.QUEUE )
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message Received from queue: " +orderStatus );
	}
}