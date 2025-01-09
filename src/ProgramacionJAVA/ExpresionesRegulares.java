/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

/**
 *
 * @author Ra�l
 */
public class ExpresionesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
Explica qu� es una expresi�n regular
Definici�n simple: 
"Una expresi�n regular es una secuencia de caracteres 
        que define un patr�n de b�squeda en un texto. 
        Nos ayuda a verificar si una cadena 
        cumple con ciertos requisitos."

Ejemplo pr�ctico: 
        "Por ejemplo, podemos usar una expresi�n regular para verificar
        si una direcci�n de correo electr�nico contiene una @ y un .."

En Java, las expresiones regulares se manejan con las clases 
        Pattern y Matcher. 
        El m�todo m�s sencillo para empezar es String.matches().             
        */
    }
    
   /**
    * String texto: La cadena que queremos validar.
    * String patron: La expresi�n regular que define el formato v�lido.
    * 
    */
    public class Validador {
        public static boolean validarTexto(String texto, String patron) {
             return texto.matches(patron);
        }
        
        //Ejemplo 1: Validar si un email es v�lido
        /*
        Patr�n del email:
        ^ y $: Comienzo y fin de la cadena.
        [\\w._%+-]+: Uno o m�s caracteres permitidos antes de la @.
        @[\\w.-]+: Exactamente una @, seguida de letras, n�meros, puntos o guiones.
        \\.[a-zA-Z]{2,6}: Un punto seguido de entre 2 y 6 letras (como .com, .es).
        */
         public static boolean validarEmail(String email) {
            // Expresi�n regular para validar un correo electr�nico
            String patron = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
            return email.matches(patron);
        }
         
        //Ejemplo 2: Validar matr�culas (formato LDDDDD)
         /*
         ^[A-Z]: Comienza con una letra may�scula.
         \\d{5}$: Sigue con exactamente cinco d�gitos hasta el final.
         Secuencias especiales que comienzan con \ en una expresi�n regular:

\d: Coincide con cualquier d�gito (0-9).
\D: Coincide con cualquier car�cter que no sea un d�gito.
\w: Coincide con cualquier car�cter de palabra (letras, d�gitos y _).
\W: Coincide con cualquier car�cter que no sea de palabra.
\s: Coincide con cualquier espacio en blanco (espacios, tabulaciones, saltos de l�nea).
\S: Coincide con cualquier car�cter que no sea un espacio en blanco.
         
         */
         public static boolean validarMatricula(String matricula) {
             String patron = "^[A-Z]\\d{5}$";
            return matricula.matches(patron);
        }
         
    }
    
}
