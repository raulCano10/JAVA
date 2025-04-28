/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author raul
 */
public class Persona {
    private String nif;
    private String nombre;

     public Persona(String nif){
         this.nif = nif;
        System.out.println("SE ESTA EJECUTANDO CONTRUCTOR PERSONA");
    }     
     
    public Persona(String nif, String nombre){
        this.nif = nif;
        this.nombre = nombre;
    }
    
    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
