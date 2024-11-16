package com.app.kafkatestapp.controller;

import com.app.kafkatestapp.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    @PostMapping("/write")
    public void writeMessage(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
    }
}
