package com.kafka.producer_controller;

import com.kafka.model.Cource;
import com.kafka.producer_service.producerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/master/kafka")
public class producerController {

    @Autowired
    producerService service;


    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody Cource cource){
        String resp=service.sendMessgage(cource);
        return new ResponseEntity<String>(resp,HttpStatus.OK);
    }
}
