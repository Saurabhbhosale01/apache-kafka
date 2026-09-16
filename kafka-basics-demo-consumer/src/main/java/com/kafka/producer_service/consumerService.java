package com.kafka.producer_service;

import com.kafka.model.Cource;

public interface consumerService {

    void consumemsg(Cource cource);

    String getMessage();
}