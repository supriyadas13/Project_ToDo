package com.supriya.spring.boot.datastore.controller;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.http.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.supriya.spring.boot.datastore.model.Task;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class ToDoControllerTest {
    
    @Autowired
    private MockMvc mockMvc;

    private  ObjectMapper mapper = new JsonMapper();

   /* @Test
    public void getAllTasksTest(){
        try{
            mockMvc.perform(get("/to-do/"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(jsonPath("$").isArray())
            .andExpect(jsonPath("$").isEmpty());

           // mockMvc.perform(post("/to-do/").content(mapper.writeValueAsString(new Task()))
           // .contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk())
           // .andExpect(jsonPath("$.taskName").isEmpty());
            
            mockMvc.perform(get("/to-do/")).andDo(print()).andExpect(status().isOk()).andExpect(jsonPath("$").isArray())
            .andExpect(jsonPath("$").isNotEmpty());

        } catch (Exception e){
            fail("exception : "+e.getLocalizedMessage());
        }
    
    }*/
}