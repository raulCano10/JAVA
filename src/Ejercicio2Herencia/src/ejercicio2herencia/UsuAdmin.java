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
public class UsuAdmin extends UsuNormal {
    
    public UsuAdmin(String nombre, String password, String email) {
        super(nombre, password, email);
    }
    
    @Override
    public void listarUsuarios(ArrayList<UsuNormal> listaUsuarios){
        
    }
    
    public void cambiarPassword(String password){
        
    }
}
