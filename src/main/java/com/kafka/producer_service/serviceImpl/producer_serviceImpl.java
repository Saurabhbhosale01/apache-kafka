package com.kafka.producer_service.serviceImpl;

import com.kafka.model.Cource;
import com.kafka.producer_service.producerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class producer_serviceImpl implements producerService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    @Override
    public String sendMessgage(Cource cource) {
        kafkaTemplate.send("orders","course", cource.toString());
        return "message sent to kafka by kafka producer";
    }
}
