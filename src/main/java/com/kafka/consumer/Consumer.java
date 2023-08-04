package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "firstTopic",groupId = "demoGroup")
    public void listenToTopic(String message){
        System.out.println(message);
    }
}
