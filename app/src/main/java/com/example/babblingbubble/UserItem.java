package com.example.babblingbubble;

import java.util.ArrayList;

public class UserItem {
    private String userDisplayName;
    private String userEmailAddress;
    private String uid;
    private ArrayList<String> groupsArray;

    public UserItem(String userDisplayName, String userEmailAddress, String uid, ArrayList<String> groupsArray) {
        this.userDisplayName = userDisplayName;
        this.userEmailAddress = userEmailAddress;
        this.uid = uid;
        this.groupsArray = groupsArray;

    }
    public UserItem() {

    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getUserEmailAddress() {
        return userEmailAddress;
    }

    public void setUserEmailAddress(String userEmailAddress) {
        this.userEmailAddress = userEmailAddress;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ArrayList<String> getUserGroups() {
        return groupsArray;
    }

    public void setUserGroups(ArrayList<String> groupsArray) {
        this.groupsArray = groupsArray;
    }
}
