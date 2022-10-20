package com.prod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafaProduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafaProduceApplication.class, args);
	}

}
