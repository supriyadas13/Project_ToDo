package com.supriya.spring.boot.datastore.controller;

import java.util.List;

import com.supriya.spring.boot.datastore.entity.TaskRepo;
import com.supriya.spring.boot.datastore.model.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
    
    @Autowired
    private TaskRepo taskRepo;

    @GetMapping("/")
    public String home(){
       return ("Welcome");
    }

    @GetMapping("/user")
    public String user(){
       return ("Welcome user");
    }

    @GetMapping("/admin")
    public String admin(){
       return ("Welcome admin");
    }

    @GetMapping("/to-do/")
        public List<Task> getAllTasks(){
            return taskRepo.findAll();
        }
    
    @GetMapping("/to-do/{id}")
        public Task getTaskbyID(@PathVariable long id){
            return taskRepo.getOne(id);
        }
    
    
    @PostMapping("/to-do/")
        public Task addTask(@RequestBody Task taskobj){
            taskRepo.save(taskobj);
            return taskobj;  
        }

    @PutMapping("/to-do/{id}")
        public Task updateTask(@RequestBody Task taskobj){
            taskRepo.save(taskobj);
            return taskobj;  
        }
    
    @DeleteMapping("/to-do/{id}")
        public Task deleteTask(@RequestBody Task taskobj){
            taskRepo.save(taskobj);
            return taskobj;  
        }

}