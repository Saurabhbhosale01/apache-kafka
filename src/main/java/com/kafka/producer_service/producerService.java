package com.kafka.producer_service;

import com.kafka.model.Cource;

public interface producerService {
    
    String  sendMessgage(Cource cource);
}
