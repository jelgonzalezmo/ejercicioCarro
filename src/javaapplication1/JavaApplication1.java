/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    System.out.println("Nombre primer pasajero");
    String nombrePasajero1=teclado.next();
    System.out.println("Apellido primer pasajero");
    String apellidoPasajero1=teclado.next();
    System.out.println("Nombre segundo pasajero");
    String nombrePasajero2=teclado.next();
    System.out.println("Apellido segundo pasajero");
    String apellidoPasajero2=teclado.next();
    System.out.println("Nombre conductor");
    String nombreConductor=teclado.next();
    System.out.println("Apellido  conductor");
    String apellidoConductor=teclado.next();
     
    Person pasajero1= new Person(nombrePasajero1,apellidoPasajero1);
    Person pasajero2= new Person(nombrePasajero2,apellidoPasajero2);
    Person conductor= new Person(nombreConductor,apellidoConductor);
    
    Car carro=new Car();
    carro.setPassangers(pasajero1);
    carro.setOtherpassanger(pasajero2);
    carro.setDriver(conductor);
    
    System.out.println("nombre de pasajeros");
    String [] nombres=carro.getpassangers();
   for
    
    
    
       
    }
  
    
}
