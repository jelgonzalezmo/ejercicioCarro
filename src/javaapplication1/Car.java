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
public class Car {
    private Person passangers;
    private Person otherpassanger; 
    private Person  driver;

   
    public Person getPassangers() {
        return passangers;
    }

    public Person getOtherpassanger() {
        return otherpassanger;
    }

    public Person getDriver() {
        return driver;
    }

    public void setPassangers(Person passangers) {
        this.passangers = passangers;
    }

    public void setOtherpassanger(Person otherpassanger) {
        this.otherpassanger = otherpassanger;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

 String [] getpassangers(){
 String[] names =new String[2];
 names[0]=this.passangers.getName();
 names[1]=this.otherpassanger.getName();
 return names;
 }

}
