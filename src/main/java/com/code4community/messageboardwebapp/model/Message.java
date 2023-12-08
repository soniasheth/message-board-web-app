package com.code4community.messageboardwebapp.model;

import java.time.LocalDateTime;

public class Message {
    private String text;
    private final int maxText = 128;
    private LocalDateTime timeStamp;

    public Message(String text) {
        this.text = text;
    }
    public String getMessageText() {
        return this.text;

    }

    public boolean validMessage() {
        return this.text != null && this.text.length() <= maxText && !text.isEmpty();
    }



}

// Real time updates -> JavaScript
// CSS -> Designing the webpage
