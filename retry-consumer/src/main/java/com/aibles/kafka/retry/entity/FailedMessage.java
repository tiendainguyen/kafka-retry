package com.aibles.kafka.retry.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "failed_message")
public class FailedMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String message;

    @Column
    private String topic;

    @Column
    private Long consumerOffset;

    @Column
    private String exception;

    public FailedMessage() {}

    public FailedMessage(String message) {
        this.message = message;
    }

    public FailedMessage(String message, String topic, Long consumerOffset, String exception) {
        this.message = message;
        this.exception = exception;
        this.consumerOffset = consumerOffset;
        this.topic = topic;
    }
}
