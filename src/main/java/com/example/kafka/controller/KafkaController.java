package com.example.kafka.controller;

import com.example.kafka.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaController {
    @Autowired
    private ProducerService producerService;
    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam("message") String message){
        producerService.sendMsgToTopic(message);
    }
}
