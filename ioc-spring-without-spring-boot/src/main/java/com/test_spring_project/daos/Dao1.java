package com.test_spring_project.daos;
import org.springframework.beans.factory.annotation.Qualifier;


import java.util.Scanner;


public class Dao1 implements DaoInterface {

    private double data ; 

    public Dao1(){
         System.out.println("============ dao 1 ================");
         Scanner sc =new Scanner(System.in) ; 
         this.data = sc.nextDouble()   ; 
    }

    public double getData() {
       return this.data ;    
    }

    
}
