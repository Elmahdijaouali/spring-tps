package com.test_spring_project;

import com.test_spring_project.config.AppConfig;
import com.test_spring_project.views.View1;
import com.test_spring_project.views.View2;
import com.test_spring_project.views.View5;
import com.test_spring_project.views.Viewable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.ObjectInputFilter;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // 1 - without anythings

       //  Viewable view = new View1() ;
       // view.display();

        //2- use config txt

       // Viewable view = new View2();
       // view.display();

       //3-  use config xml

      //  ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      //  Viewable view =(Viewable) context.getBean("view3");
      //  view.display();



     //4 - use annotation @Component

      //  ApplicationContext context = new AnnotationConfigApplicationContext("com.test_spring_project") ;
     //  Viewable view = (Viewable) context.getBean("view4");
     //  view.display();


        //5 - use java-based configuration

        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //Viewable view = (Viewable) context.getBean("view5");
        //view.display();

    }
}