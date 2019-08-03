package com.example.babblingbubble;

import java.util.Date;

public class ChatMessage {

    private String messageText;
    private String messageUser;
    private String photoUrl;
    private long messageTime;

    public ChatMessage(String messageText, String messageUser, String photoUrl) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        this.photoUrl = photoUrl;

        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public ChatMessage(){

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
