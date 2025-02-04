/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.util.Random;

/**
 *
 * @author raul
 */
public class Utilidades {

    public static boolean validarEmail(String email) {
        //Compruebo si el email esta bien formateado o no
        //1. Si contiene una @
        //2. Si contiene un "."
        //3. Si el ultimo punto es posterior a la @

        int indexArroba = email.indexOf('@');
        int indexPunto = email.indexOf('.');

        if (indexArroba > 0 && indexPunto > 0
                && indexPunto > indexArroba + 1) {
            return true;
        } else {
            System.out.println("--> ERROR. Email incorrecto");
        }

        return false;
    }

    public static String generarCodigoAleatorio() {
        //TODO: CONSTRUIR EL CODIGO ALEATORIO
        Random random = new Random();
        int l1 = random.nextInt(65, 91);
        int l2 = random.nextInt(65, 91);

        int n1 = random.nextInt(10);
        int n2 = random.nextInt(10);
        int n3 = random.nextInt(10);

        char letra1 = (char) l1;
        char letra2 = (char) l2;

        String codigoAleatorio = "" + letra1 + letra2 + n1 + n2 + n3;

        return codigoAleatorio;
    }
}
