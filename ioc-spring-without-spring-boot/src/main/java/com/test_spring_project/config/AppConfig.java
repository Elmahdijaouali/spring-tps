package com.test_spring_project.config;

import com.test_spring_project.controller.Controller3;
import com.test_spring_project.controller.Controllerable;
import com.test_spring_project.daos.Dao4;
import com.test_spring_project.daos.DaoInterface;
import com.test_spring_project.views.View5;
import com.test_spring_project.views.Viewable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DaoInterface dao4(){
        return  new Dao4();
    }
    @Bean
    public Controllerable controller3(){
        return  new Controller3();
    }

    @Bean
    public Viewable view5(){
        return  new View5();
    }

}
