package com.app.kafkatestapp.controller;

import com.app.kafkatestapp.consumer.KafkaConsumer;
import com.app.kafkatestapp.msgs.KafkaMsg;
import com.app.kafkatestapp.msgs.KafkaReturnMsg;
import com.app.kafkatestapp.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class KafkaController {

    private final KafkaProducer kafkaProducer;
    private final KafkaConsumer kafkaConsumer;

    @PostMapping("/write")
    public KafkaReturnMsg writeMessage(@RequestBody KafkaMsg message) {
        kafkaProducer.sendMessage(message);
        return kafkaConsumer.getMessage(message.toString());
    }
}
