/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usovehiculo;

import java.util.Scanner;

/**
 *
 * @author daw127
 */
public class UsoVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         System.out.println("Escribe matricula");
         String matricula=sc.nextLine();
         
         Vehiculo coche=new Vehiculo();
         
         if (Vehiculo.validaMatricula(matricula)) {
             System.out.println("valido");
        }else{
             System.out.println("invalido");}
        
         
         
    }
   
    
}
