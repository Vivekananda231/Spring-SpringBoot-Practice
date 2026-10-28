package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class NotificationService{
    private final Notification notification;
    public NotificationService(Notification notification){
        this.notification=notification;
    }

    public void sendNotification(){
        notification.send();
    }
}
