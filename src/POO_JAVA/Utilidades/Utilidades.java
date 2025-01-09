/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author raul
 */
public class Utilidades {
    public static boolean validarEmail(String email){
        //Compruebo si el email esta bien formateado o no
                //1. Si contiene una @
                //2. Si contiene un "."
                //3. Si el ultimo punto es posterior a la @

                int indexArroba = email.indexOf('@');
                int indexPunto = email.indexOf('.');

                if(indexArroba > 0 && indexPunto > 0
                        && indexPunto > indexArroba + 1){
                    return true;
                }else{
                    System.out.println("--> ERROR. Email incorrecto");
                }
                
                return false;
    }
}
