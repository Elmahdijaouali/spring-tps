package com.test_spring_project.daos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Component("dao3")
@Lazy
public class Dao3 implements DaoInterface{

    private double data ;

    public Dao3(){
        System.out.println(" from Dao 3");
        Scanner sc;
        try {
            sc = new Scanner(new File("data.txt"));
            this.data = sc.nextDouble()   ;

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public double getData() {
        return this.data ;
    }
}
