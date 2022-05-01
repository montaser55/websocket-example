package com.example.websocketexample.controller;

import com.example.websocketexample.controller.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ChatController {

    @MessageMapping("/hello")
    @SendTo("/chatroom/greetings")
    public Message greeting(Message message) throws Exception {
        Thread.sleep(1000); // simulated delay
        Message replyMessage = new Message();
        replyMessage.setMessage("Hello, " + HtmlUtils.htmlEscape(message.getSenderName()) + "!");
        return replyMessage;
    }
}
