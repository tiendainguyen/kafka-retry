package com.aibles.kafka.main.dto;

import com.aibles.kafka.main.enums.EventType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class MyDTO {
    @NotNull(message = "Please provide a valid eventTYpe.")
    private EventType eventType;

    @NotNull(message = "Please provide a valid message.")
    private String message;

}
