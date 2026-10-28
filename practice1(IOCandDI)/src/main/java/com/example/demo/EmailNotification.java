package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Email notification sent");
    }
}
