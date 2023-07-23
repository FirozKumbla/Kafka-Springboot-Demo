package com.example.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "myTopic", groupId = "myGroup")
    public void listenToTopic(String receivedMsg){
        System.out.println("The received message is "+receivedMsg);
    }
}
