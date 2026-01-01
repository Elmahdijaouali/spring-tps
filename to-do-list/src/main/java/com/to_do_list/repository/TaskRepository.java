package com.to_do_list.repository;

import com.to_do_list.entity.Task;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository  extends JpaRepository<Task, Long> {

    Task findByName(String name);

    void deleteById(Long id);

    @Override
    <S extends Task> List<S> findAll(Example<S> example);


    List<Task> findAllByNameContaining(String name);

}
