package com.example.babblingbubble;

import com.android.volley.toolbox.StringRequest;

import java.util.Date;

public class UserMessage {

    private String messageText;
    private String messageUser;
    private String photoUrl;
    private String bubbleName;
    private long messageTime;
    private boolean readState;

    public UserMessage(String messageText, String messageUser, String photoUrl, String bubbleName, boolean readState) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        this.photoUrl = photoUrl;
        this.readState = readState;
        this.bubbleName = bubbleName;

        // Initialize to current time
        messageTime = new Date().getTime();
    }

    public UserMessage(){

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

    public boolean getReadState() {
        return readState;
    }

    public void setReadState(boolean readState) {
        this.readState = readState;
    }

    public String getMessageBubble() {
        return bubbleName;
    }

    public void setMessageBubble(String bubbleName) {
        this.bubbleName = bubbleName;
    }


}
