/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Contacto {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    private static int contadorId = 0;
    
    public Contacto(String nombre, String email, String tel){
        this.nombre = nombre;
        this.email = email;
        this.telefono = tel;       
        Contacto.contadorId++;
        this.id = Contacto.contadorId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static int getContadorId() {
        return Contacto.contadorId;
    }

    public static void setContadorId(int contadorId) {
        Contacto.contadorId = contadorId;
    }
            
    
}
