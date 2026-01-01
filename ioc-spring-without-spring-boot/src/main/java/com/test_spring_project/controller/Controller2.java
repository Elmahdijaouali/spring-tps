package com.test_spring_project.controller;

import com.test_spring_project.daos.DaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Controller2 implements Controllerable{

    @Autowired
    @Qualifier("dao3")
    private DaoInterface dao ;

    public Controller2(@Qualifier("dao3") DaoInterface dao){
        System.out.println("============ controller 2 ================");
        this.dao = dao ;
    }

    @Override
    public double calcul(){
        return (dao.getData() * 2.5) / 100  ;
    }
}
