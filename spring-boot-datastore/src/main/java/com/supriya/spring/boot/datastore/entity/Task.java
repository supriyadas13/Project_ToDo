package com.supriya.spring.boot.datastore.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TaskTable", schema="ToDo")
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable=false, unique=false)
    private String taskName;
    
    private String taskStatus;

    private String description;
  
    private LocalDate  taskCreateDate;

    private LocalDate  taskUpdateDate;

    public Task(){

    }

    public Task(Long id, String taskName, String taskStatus, String description, LocalDate taskCreateDate, LocalDate  taskUpdateDate){

        this.id=id;
        this.taskName=taskName;
        this.taskStatus=taskStatus;
        this.description=description;
        this.taskCreateDate=taskCreateDate;
        this.taskUpdateDate=taskUpdateDate;  


    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
  

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        
    }

    public LocalDate getTaskCreateDate() {
        return taskCreateDate;
    }

    public void setTaskCreateDate(LocalDate taskCreateDate) {
        this.taskCreateDate = taskCreateDate;
    }

    public LocalDate getTaskUpdateDate() {
        return taskUpdateDate;
    }

    public void setTaskUpdateDate(LocalDate taskUpdateDate) {
        this.taskUpdateDate = taskUpdateDate;
    }

 
    
}