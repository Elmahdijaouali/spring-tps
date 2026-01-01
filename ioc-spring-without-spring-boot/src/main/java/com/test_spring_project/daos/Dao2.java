package com.test_spring_project.daos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Dao2 implements DaoInterface {

    private double data ; 

    public Dao2(){
         Scanner sc;
         try {
            sc = new Scanner(new File("data.txt"));
            this.data = sc.nextDouble()   ; 

         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } 
         
    }

    public double getData() {
       return this.data ;    
    }

  
    
}
