/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Bicicleta {
    private int revoluciones;
    private int pinonActual;
    private final String propietario;
    
    //Constructor: 
    //Por defecto, la bici arranca en el pi��n 3 y est� parada (con 0 revoluciones). 
    public Bicicleta(String propietario){
        this.pinonActual = 3;
        this.revoluciones = 0;
        this.propietario = propietario;
    }
    
    //Metodos de mi clase
    
    //+ pedalear(): dobla las revoluciones (si esta parada se pone a 1 km/h).
    public void pedalear(){
        if(this.revoluciones == 0){
            this.revoluciones = 1;
        }else{
             this.revoluciones = this.revoluciones*2;
             //this.revoluciones *= 2;
        }              
    }
    
    //+ frenar(): reduce a la mitad las revoluciones 
    public void frenar(){
        this.revoluciones = this.revoluciones/2;
    }
    
    //+cambiarPi�on(int pi�on): ajusta el pi��n al dado. 
    public void cambiarPinon(int pinon){
        if(pinon >= 1 && pinon <= 5){
            this.pinonActual = pinon;
        }else{
            System.out.println("ESTAS INTENTANDO CAMBIAR A UN PI�ON QUE NO EXISTE");
        }
        
    }
    
    //+ mostrarVelocidad(): muestra por consola la velocidad. Hay que 
    //calcularla (revoluciones x multiplicador pi��n).
    public void mostrarVelocidad(){
        double multiplicador = 0;
        switch(this.pinonActual){
            case 1:
                multiplicador = 2;
                break;
            case 2:
                multiplicador = 1.5;
                break;
            case 3:
                multiplicador = 1;
                break;
            case 4:
                multiplicador = 0.5;
                break;
            case 5:
                multiplicador = 0.3;
                break;
        }       
        double velocidad = revoluciones * multiplicador;
        System.out.println("La bici del propietario " + this.propietario + " tiene velocidad " + velocidad);        
    }
    
    public double obtenerVelocidad(){
        double multiplicador = 0;
        switch(this.pinonActual){
            case 1:
                multiplicador = 2;
                break;
            case 2:
                multiplicador = 1.5;
                break;
            case 3:
                multiplicador = 1;
                break;
            case 4:
                multiplicador = 0.5;
                break;
            case 5:
                multiplicador = 0.3;
                break;
        }       
        double velocidad = revoluciones * multiplicador;
        return velocidad;
        
    }
}
