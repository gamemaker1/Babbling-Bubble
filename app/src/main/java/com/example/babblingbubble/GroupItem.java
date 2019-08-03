package com.example.babblingbubble;

import java.util.ArrayList;

class GroupItem {
    public String groupTitle;
    public ArrayList<String> peopleInGroup;
    public long groupId;

    GroupItem(String groupTitle, ArrayList<String> peopleInGroup, long groupId) {
        this.groupTitle = groupTitle;
        this.peopleInGroup = peopleInGroup;
        this.groupId = groupId;

    }

    GroupItem(){

    }

    String getGroupTitle() {
        return groupTitle;
    }

    void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    ArrayList<String> getPeopleInGroup() {
        return peopleInGroup;
    }

    void setPeopleInGroup(ArrayList<String> peopleInGroup) {
        this.peopleInGroup = peopleInGroup;
    }

    long getGroupId() {
        return groupId;
    }

    void setGroupId(long groupId) {
        this.groupId = groupId;
    }

}
