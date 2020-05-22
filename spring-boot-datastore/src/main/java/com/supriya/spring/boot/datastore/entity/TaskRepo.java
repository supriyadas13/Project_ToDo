package com.supriya.spring.boot.datastore.entity;

import com.supriya.spring.boot.datastore.model.Task;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;


public interface TaskRepo extends JpaRepository<Task, Long> {
    
   //List<Task> findByStatus(String taskStatus);
}