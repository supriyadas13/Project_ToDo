package com.supriya.spring.boot.datastore.controller;

import java.util.List;

import com.supriya.spring.boot.datastore.entity.TaskRepo;
import com.supriya.spring.boot.datastore.model.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/to-do-list")
public class ToDoController {
   
   
    @Autowired
    private TaskRepo taskRepo;

    
    @PostMapping("/addTask")
        public Task addTask(@RequestBody Task taskobj){
            taskRepo.save(taskobj);
            return taskobj;  
        }

    @PutMapping("/updateTask/{id}")
        public Task updateTask(@RequestBody Task taskobj){
            taskRepo.save(taskobj);
            return taskobj;  
        }

    @DeleteMapping("deleteTask/{id}")
        public Task deleteTask(@RequestBody Task taskobj){
            taskRepo.save(taskobj);
            return taskobj;  
        }
    
    @GetMapping("/getTasks")
        public List<Task> getAllTasks(){
            return taskRepo.findAll();
        }
    
        /*
    @GetMapping("/getTasks/{status}")
        public List<Task> getCompletedTasks(@PathVariable String taskStatus){
           // return taskRepo.findByStatus(taskStatus);
           return taskRepo.findAll
        }
*/
    @GetMapping("/getTasks/{id}")
        public Task getTaskbyID(@PathVariable long id){
            return taskRepo.getOne(id);
        }
    
    

}