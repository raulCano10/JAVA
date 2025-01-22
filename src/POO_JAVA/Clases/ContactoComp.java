/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class ContactoComp {
    private int id;
    private String nombre;
    private String email;
    private String telefono;
    
    public ContactoComp(int id, String nombre, String email, String tel){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = tel;
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
    
    public String aCadena(){
        String lineaContacto = String.format("\t%-8s \t%-20s \t%-20s \t%-20s"
                , "ID: " + this.getId()
                , "NOMBRE: " + this.getNombre()
                , "EMAIL: " + this.getEmail()
                , "TELEFONO: " + this.getTelefono());
        
        return lineaContacto;
    }
    
}
