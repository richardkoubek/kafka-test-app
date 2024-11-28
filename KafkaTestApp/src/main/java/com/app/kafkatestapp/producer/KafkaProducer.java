package com.app.kafkatestapp.producer;

import com.app.kafkatestapp.msgs.KafkaMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC="test_topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(KafkaMsg message) {
        kafkaTemplate.send(TOPIC, message.toString());
    }
}
