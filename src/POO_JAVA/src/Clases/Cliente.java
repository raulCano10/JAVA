/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Cliente {
    private String DNI;
    private String nombre;
    private String apellidos;
    private String email;
  
    public Cliente(String DNI, String nombre, String apellidos, String email) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }
    
   public Cliente(){
       
   }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    public String aCadena(){
        String cadena = "" + this.DNI + " - " + this.nombre + " - " + this.apellidos + " - " + this.email;        
        return cadena;
    }
         
    public void imprmirDetalles(){
        System.out.println(aCadena());
    }
   
}
