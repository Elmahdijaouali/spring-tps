package com.to_do_list.service;

import com.to_do_list.entity.Task;
import com.to_do_list.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public  void saveTask(Task task){
        taskRepository.save(task);
    }

    public  void deleteTask(Task task){
        taskRepository.delete(task);
    }

    public Task getTaskById(Long id){
        return taskRepository.findById(id).get();
    }

    public Task getTaskByName(String name){
        return taskRepository.findByName(name);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public List<Task> searchByName(String name){
        return  taskRepository.findAllByNameContaining(name);
    }

    public   void updateTask(Long id , Task task){

        Task taskToUpdate = taskRepository.findById(id).get();

        taskToUpdate.setName(task.getName());
        taskToUpdate.setDescription(task.getDescription());
        taskToUpdate.setStartDate(task.getStartDate());
        taskToUpdate.setEndDate(task.getEndDate());

        taskRepository.save(taskToUpdate);

    }

    public void deleteTaskById(Long id){
        taskRepository.deleteById(id);

    }
}
