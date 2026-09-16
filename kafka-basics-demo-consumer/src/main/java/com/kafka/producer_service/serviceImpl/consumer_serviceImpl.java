package com.kafka.producer_service.serviceImpl;

import com.kafka.model.Cource;
import com.kafka.producer_service.consumerService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class consumer_serviceImpl implements consumerService {

    private String message;

    @Override
    @KafkaListener(
            topics = "orders",
            groupId = "kafka-consumer-demo"
    )
    public void consumemsg(Cource cource) {

        message = cource + " got the data from kafka-producer-demo";

        System.out.println(message + " kafka demo done");
    }

    @Override
    public String getMessage() {
        return message;
    }
}