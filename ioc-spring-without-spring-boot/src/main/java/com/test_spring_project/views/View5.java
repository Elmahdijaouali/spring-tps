package com.test_spring_project.views;

import com.test_spring_project.controller.Controllerable;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.View;

public class View5 implements Viewable {

    @Autowired
    Controllerable controller;
    @Override
    public void display() {
        System.out.println("view 5");


        System.out.println(controller.calcul());
    }

}
