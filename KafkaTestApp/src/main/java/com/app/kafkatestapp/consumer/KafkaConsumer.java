package com.app.kafkatestapp.consumer;

import com.app.kafkatestapp.msgs.KafkaMsg;
import com.app.kafkatestapp.msgs.KafkaReturnMsg;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="test_topic", groupId = "test_group_id")
    public KafkaReturnMsg getMessage(String message) {
        StringBuilder sb = new StringBuilder();
        sb.append("Recieved: ").append(message);
        String msg = sb.toString();
        return new KafkaReturnMsg(msg);
    }
}
