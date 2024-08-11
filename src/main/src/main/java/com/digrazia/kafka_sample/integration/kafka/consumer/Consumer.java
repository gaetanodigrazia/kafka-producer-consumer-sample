package com.digrazia.kafka_sample.integration.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "events", groupId = "group_id")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}