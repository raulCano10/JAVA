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
public class BDUsuarios {
    private static ArrayList<UsuNormal> bd = new ArrayList<>();
    
    public static void AñadirUsuario(UsuNormal Usuario){
        BDUsuarios.bd.add(Usuario);
    }
    
    public static ArrayList<UsuNormal> obtenerBD(){
        return null;
    }
    
    public static UsuNormal obtenerUsuario(String usuario){
       return null; 
    }
    
    public static boolean verificarLogin(String usuario, String password){
        for (UsuNormal usu : bd) {
            if (usu.getNombre().equals(usuario) && usu.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    
}
