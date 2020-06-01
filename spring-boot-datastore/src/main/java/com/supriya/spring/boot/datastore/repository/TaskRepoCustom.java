package com.supriya.spring.boot.datastore.repository;

import java.util.List;

import com.supriya.spring.boot.datastore.entity.Task;

public interface TaskRepoCustom {
    
    List<Task>  findByStatus(String taskStatus);
}
