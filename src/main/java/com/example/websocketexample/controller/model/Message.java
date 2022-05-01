package com.example.websocketexample.controller.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Message {

    String senderName;
    String receiverName;
    String message;
    String date;
    Status status;
}
