package com.app.kafkatestapp.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="test_topic", groupId = "test_group_id")
    public void getMessage(String message) {
        System.out.println(message);
    }
}
