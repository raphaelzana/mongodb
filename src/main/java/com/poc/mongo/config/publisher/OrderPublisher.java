package com.poc.mongo.config.publisher;

import java.util.UUID;

import com.poc.mongo.config.constants.Constants;
import com.poc.mongo.model.Order;
import com.poc.mongo.model.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/order")
public class OrderPublisher {
 
	@Autowired
	private RabbitTemplate rabbitTemplate;
	 
		@PostMapping("/{restaurantName}")
		public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName ) {
			order.setOrderId(UUID.randomUUID().toString());
			OrderStatus orderStatus = new OrderStatus(order, "PROCESS", "Order Successfully Placed"+ restaurantName);
			
			rabbitTemplate.convertAndSend(Constants.EXCHANGE,Constants.ROUTING_KEY, orderStatus);
			return "success!!"; 
		}
}