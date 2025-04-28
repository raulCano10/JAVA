/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author raul
 */
public class DescifrarCodigoMorse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String codigoMorse = ". -. .... --- .-. .- -... ..- . -. .- / .... .- ... / .... . -.-. .... --- / . .-.. / . .--- . .-. -.-. .. -.-. .. --- / -... .. . -.";
        
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", 
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", 
            "--..", ".----", "..---", "...--", "....-", ".....", "-....", 
            "--...", "---..", "----.", "-----", "/" };
        
        String[] texto = { "A", "B", "C", "D", "E", "F", "G", "H", "I", 
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", 
            "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
            "0", " " };
        
        String[] letrasMorse = codigoMorse.split(" ");
        String resultado = "";
        for(String letras : letrasMorse){
            //Aqui ya tengo la letra morse 0, 1, 2 ,3
            for(int j = 0; j < morse.length; j++){
                if(letras.equals(morse[j])){
                    resultado = resultado + texto[j];
                    break;
                }
            }
        }
        
        System.out.println("Texto descifrado es: " + resultado);
        
    }

    
}
