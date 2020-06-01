package com.supriya.spring.boot.datastore.repository;

import com.supriya.spring.boot.datastore.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long>, TaskRepoCustom {
    

}