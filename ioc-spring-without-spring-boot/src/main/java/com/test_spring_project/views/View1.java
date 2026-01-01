package com.test_spring_project.views;
import java.io.File;
import java.util.Scanner;

import com.test_spring_project.controller.Controller;
import com.test_spring_project.controller.Controllerable;
import com.test_spring_project.daos.Dao1;
import com.test_spring_project.daos.Dao2;
import com.test_spring_project.daos.DaoInterface;

public class View1 implements Viewable {
    
    public View1(){
       

    }
    @Override
    public void display(){

        DaoInterface dao = new Dao1() ;
        Controllerable controller = new Controller(dao) ; 

        System.out.println("============ view 1 ================");
        System.out.println(controller.calcul());
    }

}
