package com.event.planner.data.model;

public enum EventState {

    NEW ("new"),
    OPEN ("open"),
    CLOSED ("closed"),
    COMPLETED ("completed");

    private final String state;

    EventState(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
