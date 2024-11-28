package com.app.kafkatestapp.controller;

import com.app.kafkatestapp.msgs.KafkaMsg;
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

    @PostMapping("/write")
    public void writeMessage(@RequestBody KafkaMsg message) {
        kafkaProducer.sendMessage(message);
    }
}
