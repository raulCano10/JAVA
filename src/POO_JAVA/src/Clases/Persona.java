/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Persona {
    private String nombre;
    private String email;
    private static int totalPersonas = 0;
    
    //Constructor
    public Persona(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
        Persona.totalPersonas++;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void mostrarDatos(){
        System.out.println(this.nombre + " - " + this.email);
    }
    
    public static int getTotalPersonas(){
        return Persona.totalPersonas;
    }
}
