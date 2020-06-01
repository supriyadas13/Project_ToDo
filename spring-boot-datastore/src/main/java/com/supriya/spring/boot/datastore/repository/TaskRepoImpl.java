package com.supriya.spring.boot.datastore.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.supriya.spring.boot.datastore.entity.Task;

import org.springframework.stereotype.Repository;

@Repository
public class TaskRepoImpl implements TaskRepoCustom {

    @PersistenceContext
    EntityManager entityManager;
    
    @Override
    public List<Task>  findByStatus(String taskStatus){
        
        Query query =
         entityManager.createNativeQuery("SELECT tab.* FROM ToDo.TaskTable as tab WHERE tab.taskStatus = ?", Task.class);
        query.setParameter(1, taskStatus);

        return query.getResultList();
    }
}               