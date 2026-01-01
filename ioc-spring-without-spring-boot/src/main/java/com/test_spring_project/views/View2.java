package com.test_spring_project.views;

import java.io.File;
import java.util.Scanner;

import com.test_spring_project.views.Viewable;
import com.test_spring_project.controller.Controller;
import com.test_spring_project.controller.Controllerable;
import com.test_spring_project.daos.Dao1;
import com.test_spring_project.daos.Dao2;
import com.test_spring_project.daos.DaoInterface;

public class View2 implements Viewable {
    
    public View2(){
       

    }
    @Override
    public void display(){

        try{
            Scanner sc = new Scanner(new File("config.txt")) ;
            String dao_name = sc.nextLine() ;

            Class dao_class = Class.forName(dao_name) ; 


            DaoInterface dao = (DaoInterface) dao_class.newInstance(); 
            
            Controllerable controller = new Controller(dao) ; 
  
            System.out.println("============ view 1 ================");
            System.out.println(controller.calcul());
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
      
    }

}
