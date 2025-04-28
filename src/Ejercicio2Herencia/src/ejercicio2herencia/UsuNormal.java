/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2herencia;

import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class UsuNormal {
    private String nombre;
    private String password;
    private String email;

    public UsuNormal(String nombre, String password, String email) {
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }
    
    public void cambiarPassword(){
        
    }
    
    public void listarUsuarios(ArrayList<UsuNormal> listaUsuarios){
        
    }

    @Override
    public String toString() {
        return "UsuNormal{" + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
