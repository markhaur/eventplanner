package com.event.planner.data.model;

public enum TaskState {
    PENDING ("pending"),
    ASSIGNED ("assigned"),
    INPROGRESS ("inprogress"),
    COMPLETED ("completed");

    private final String state;

    TaskState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
