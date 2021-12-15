package com.event.planner.data.model;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "priority")
    private int priority;

    @Column(name = "status")
    private TaskState taskState;

    @Column(name = "created_on")
    private int createdOn;

    public Task(int id, String title, String description, int priority, TaskState taskState, int createdOn) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.taskState = taskState;
        this.createdOn = createdOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public TaskState getTaskState() {
        return taskState;
    }

    public void setTaskState(TaskState taskState) {
        this.taskState = taskState;
    }

    public int getCreated_on() {
        return createdOn;
    }

    public void setCreated_on(int ccreatedOn) {
        this.createdOn = createdOn;
    }
}
