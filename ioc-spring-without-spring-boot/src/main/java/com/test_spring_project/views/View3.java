package com.test_spring_project.views;


import com.test_spring_project.controller.Controllerable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class View3 implements Viewable {

    @Override
    public void display() {
        System.out.println("print from view 3");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Controllerable controller = (Controllerable) context.getBean("controller");

        System.out.println(controller.calcul());
    }
}
