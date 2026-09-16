package com.kafka.producer_controller;

import com.kafka.producer_service.consumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/master/kafka")
public class consumerController {

    @Autowired
    private consumerService service;

    @GetMapping("/receive-msg")
    public ResponseEntity<String> getCource() {

        return ResponseEntity.ok(service.getMessage());
    }
}