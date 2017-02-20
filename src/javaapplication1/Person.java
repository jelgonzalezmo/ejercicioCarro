/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Estudiante
 */
public class Person {
   private String name;
   private String last_name;

    public Person(String name, String last_name) {
        this.name = name;
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
}
