package com.javainuse.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.javainuse.domain.Pedido;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${javainuse.rabbitmq.queue}")
	public void recievedMessage(Pedido pedido) {
		System.out.println("Recieved Message From RabbitMQ: " + pedido);
	}
}