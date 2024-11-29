package com.app.kafkatestapp.msgs;

import lombok.Data;

@Data
public class KafkaReturnMsg {
    private String message;

    public KafkaReturnMsg(String message) {
        this.message = message;
    }
}
