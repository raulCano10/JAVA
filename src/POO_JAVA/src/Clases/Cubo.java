/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Cubo {
    private int capacidadMaxima;
    private int contenido;
    
    public Cubo(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }

    
    public void llenarCubo(){
        this.contenido = this.capacidadMaxima;
    }
    public void vaciarCubo(){
        this.contenido = 0;
    }
    
    public void rellenarCubo(int litros){
        if(litros + this.contenido > this.capacidadMaxima){
            System.out.println("EL CUBO SE DEBORDA NO PUEDO RELLENARLO");
        }else{
            //this.contenido = this.contenido + litros;
            this.contenido += litros;
        }
    }
    
    public void pintarCubo(){
        String base = "########";
        int vacias = this.capacidadMaxima - this.contenido;
        
        for(int i=0; i < this.capacidadMaxima; i++){
            if(vacias > 0){
                System.out.println("#      #");
                vacias--;
            }else{
                System.out.println("#~~~~~~#");
            }
        }
     
        System.out.println(base);
    }
    
}


