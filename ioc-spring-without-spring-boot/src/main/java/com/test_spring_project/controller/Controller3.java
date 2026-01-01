package com.test_spring_project.controller;

import com.test_spring_project.daos.DaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Controller3 implements Controllerable {

    @Autowired
    private DaoInterface dao ;

    public Controller3( ){
        System.out.println("============ controller 3 ================");

    }

    @Override
    public double calcul(){
        return (dao.getData() * 2.5) / 100  ;
    }
}
