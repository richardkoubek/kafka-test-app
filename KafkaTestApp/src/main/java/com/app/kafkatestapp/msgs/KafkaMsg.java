package com.app.kafkatestapp.msgs;

import lombok.Data;

@Data
public class KafkaMsg {
    private String key;
    private String value;
}
