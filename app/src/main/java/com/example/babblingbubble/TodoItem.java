package com.example.babblingbubble;

import java.util.Date;

public class TodoItem {

    private String todoTitle;
    private String claimedBy;
    private long todoInitTime;
    private long itemId;

    public TodoItem(String todoTitle, String claimedBy, long itemId) {
        this.todoTitle = todoTitle;
        this.claimedBy = claimedBy;
        this.itemId = itemId;

        // Initialize to current time
        todoInitTime = new Date().getTime();
    }

    public TodoItem(){

    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getClaimedBy() {
        return claimedBy;
    }

    public void setClaimedBy(String claimedBy) {
        this.claimedBy = claimedBy;
    }

    public long getTodoInitTime() {
        return todoInitTime;
    }

    public void setTodoInitTime(long todoInitTime) {
        this.todoInitTime = todoInitTime;
    }

    public long getTodoItemId() {
        return itemId;
    }

    public void setTodoItemId(long itemId) {
        this.itemId = itemId;
    }

}