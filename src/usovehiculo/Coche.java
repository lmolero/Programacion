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
public class Coche extends Vehiculo {

    int numPuertas;
    int factorPot;

    public Coche() {
        super();

    }

    @Override //metodo heredado de la clase vehiculo
    public String verFicha() {

        return "las caracteristicas del coche son: " + super.verFicha() + "El numero de puestas es: " + numPuertas + "el factor pot es: " + factorPot;
    }

    @Override
    public double calcularCuota() {
        double cuotaCoche =0.5*factorPot+super.calcularCuota();
        return cuotaCoche; 
    }
    
    
}
