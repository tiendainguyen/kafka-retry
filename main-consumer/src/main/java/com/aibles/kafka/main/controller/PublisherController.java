package com.aibles.kafka.main.controller;

import com.aibles.kafka.main.dto.MyDTO;
import com.aibles.kafka.main.publisher.KafkaPublisher;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PublisherController {

    @Autowired
    KafkaPublisher publisher;

    @PostMapping(value = "/publish")
    public void publish(@RequestBody @Valid MyDTO dto) {
        log.info("Publishing the event {}", dto);
        publisher.publish(dto);
    }
}
