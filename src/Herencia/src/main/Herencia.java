/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import herencia.Alumno;

/**
 *
 * @author raul
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
            for(int i = 0; i < 10 ; i++){
                System.out.println("Valor de i:" + i);
            }
            
            
            
            
            
            
            
            
            
            
            
            
            Alumno alum = new Alumno("DAW1", "1234567G");
        }catch(Exception ex){
            System.out.println("ERROR" + ex.getMessage()); 
        }
        
       
        
        //System.out.println("nif" + nif);
        
    }
    
}
