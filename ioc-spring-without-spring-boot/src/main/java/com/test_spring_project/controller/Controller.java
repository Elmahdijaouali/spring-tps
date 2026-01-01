package com.test_spring_project.controller;

import com.test_spring_project.controller.Controllerable;
import com.test_spring_project.daos.DaoInterface;

public class Controller implements Controllerable {
     
    private DaoInterface dao ; 

    public Controller(DaoInterface dao){
       System.out.println("============ controller 1 ================");
       this.dao = dao ; 
    }

    @Override
    public double calcul(){
        return (dao.getData() * 2.5) / 100  ;  
    }
}
