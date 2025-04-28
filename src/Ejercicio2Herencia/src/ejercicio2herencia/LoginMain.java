/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2herencia;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class LoginMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        UsuNormal zipi = new UsuNormal("zipi", "1234", "zipi@kk.com");
        UsuNormal zape = new UsuNormal("zape", "1234", "zape@kk.com");
        UsuAdmin root = new UsuAdmin("root", "root", "root@kk.com");
        BDUsuarios.AñadirUsuario(zape);
        BDUsuarios.AñadirUsuario(zipi);
        BDUsuarios.AñadirUsuario(root);
        Scanner sc = new Scanner(System.in);
        boolean goodLogin = false;
        int intentosLogin = 2;
        do {
            System.out.println("Login");
            System.out.println("*".repeat(20));
            System.out.print("Usuario: ");
            String usuario = sc.next();
            System.out.print("Contraseña: ");
            String passwd = sc.next();
            goodLogin = BDUsuarios.verificarLogin(usuario, passwd);
            
            
            
            if (goodLogin){
                UsuNormal usu = BDUsuarios.obtenerUsuario(usuario);
                
                motrarMenu(usu);
                //opcion = 
            }else{
                intentosLogin -= 1;
            }
        } while (intentosLogin != 0);
    }
    public static void motrarMenu(UsuNormal usuario){
        boolean esAdmin = false;
        if (usuario instanceof UsuAdmin){
            esAdmin = true;
        }
        System.out.println("*".repeat(12));
        if (esAdmin){
            System.out.println("Administrador: " + usuario.getNombre());
        } else {
            System.out.println("Usuario: " + usuario.getNombre());
        }
        System.out.println("*".repeat(12));
        System.out.println("1. Salir del sistema");
        System.out.println("2. Listar Usuarios");
        System.out.println("3. Cambiar Password");
        if(esAdmin){
            System.out.println("4. Cambiar Password Usu");
        }
        System.out.print("Elige opción > ");
        
    }

}
