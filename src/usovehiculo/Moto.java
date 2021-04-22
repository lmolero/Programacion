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
public class Moto extends Vehiculo{
    int cilindrada;
    int factorPotencia;
    
 public Moto() {
        super();

    }
//setter moto
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setFactorPotencia(int factorPotencia) {
        this.factorPotencia = factorPotencia;
    }
//getter moto
    public int getCilindrada() {
        return cilindrada;
    }

    public int getFactorPotencia() {
        return factorPotencia;
    }
 
  @Override //metodo heredado de la clase vehiculo
    public String verFicha() {

        return "las caracteristicas de la moto son: " + super.verFicha() + "Cilindrada: " + cilindrada+ "el factor de potencia es: " + factorPotencia;
    }

    @Override
    public double calcularCuota() {
      double cuotaMoto =0.4*factorPotencia+super.calcularCuota();
        return cuotaMoto; 
    }
    public int calculaPotencia(){
        if (this.cilindrada<=250) {
         return   this.factorPotencia=1;
        }
        //aqui tengo q crear las otras condiciones 
            
        return 0;
    }
     
    
}
