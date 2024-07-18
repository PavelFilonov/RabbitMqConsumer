package com.ru.rabbitmqconsumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
@Slf4j
public class RabbitListener {

	@org.springframework.amqp.rabbit.annotation.RabbitListener(queues = {"${app.rabbitmq.queue}"})
	public void printMessage(String message) {
		log.info("Message from rabbit: {}", message);
	}

}
