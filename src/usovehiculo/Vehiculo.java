/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usovehiculo;

/**
 *
 * @author daw127
 */
public class Vehiculo {

    String conductor;
    String Matricula;

    public Vehiculo() {
    }

    public String verFicha() {
        return "Vehiculo{" + "conductor=" + conductor + ", Matricula=" + Matricula + '}';
    }
    
    public double calcularCuota(){
     double cuota=250;  
    return cuota;
    }
//metodos setter de vehiculo
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
   //metodo getter de vehiculo

    public String getConductor() {
        return conductor;
    }

    public String getMatricula() {
        return Matricula;
    }
    public static boolean validaMatricula(String cadena){
      return cadena.matches("[0-9]{0,4}[A-Z /z]{0,3}");
      }

}
