package com.to_do_list.controller;

import com.to_do_list.entity.Task;
import com.to_do_list.service.TaskService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.function.ServerResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> findAll(){
        return ResponseEntity.ok( taskService.getAllTasks()) ;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Task>> searchByName(@RequestParam("name") String name){
        return ResponseEntity.ok(taskService.searchByName(name) ) ;
    }

    @GetMapping("/task/{name}")
    private ResponseEntity<Task> getTaskByName(@PathVariable("name") String name){
        Task task = taskService.getTaskByName(name)  ;

        if(task == null){
             return ResponseEntity.notFound().build() ;

            }
        return ResponseEntity.status(HttpStatus.CREATED).body(task) ;

    }

    @PostMapping
    public ResponseEntity<Task> addTask(@RequestBody Task task){
        taskService.saveTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(task) ;
    }

    @PutMapping("/task/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable("id") Long id , @RequestBody  Task task){

        taskService.updateTask(id , task);

        return ResponseEntity.status(HttpStatus.OK).body(task) ;
    }

    @DeleteMapping("/task/{id}")
    public ResponseEntity<Map<String , String>> deleteTask(@PathVariable("id") Long id){

        taskService.deleteTaskById(id);
        Map data = new HashMap();
        data.put("message", "task deleted successfully");
        return ResponseEntity.ok(data) ;
    }

}
