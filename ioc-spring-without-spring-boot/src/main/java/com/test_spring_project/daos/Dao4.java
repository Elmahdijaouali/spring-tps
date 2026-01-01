package com.test_spring_project.daos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dao4  implements DaoInterface{

    private double data ;

    public Dao4(){
        System.out.println(" from Dao 4");
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
