package com.amitkr25.springkafka01.SpringKafka01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amitkr25.springkafka01.SpringKafka01.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
	private KafkaProducer kafkaProducer;

	// this spring bean has one parameterized constructor so we can skip the @Autowired annotation
	public MessageController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}
	
	//rest endpoint: http://localhost:8080/api/v1/kafka/publish?message=hello world
	//https://stackoverflow.com/questions/47168342/kafka-1-0-stops-with-fatal-shutdown-error-logs-directory-failed
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message) {
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message sent to the topic: " + message);
	}
	
}
