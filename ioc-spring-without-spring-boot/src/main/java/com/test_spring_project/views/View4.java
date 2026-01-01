package com.test_spring_project.views;

import com.test_spring_project.controller.Controllerable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class View4 implements Viewable{
    @Autowired
     Controllerable controller;
    @Override
    public void display() {
        System.out.println("view 4");


        System.out.println(controller.calcul());
    }
}
