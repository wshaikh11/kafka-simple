package com.kafka.controller;

import com.kafka.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaController {

    @Autowired
    private Producer producer;
    @GetMapping("/producerMsg")
    public void getMessage(@RequestParam String message){
        producer.sendMessageToTopic(message);
    }
}
