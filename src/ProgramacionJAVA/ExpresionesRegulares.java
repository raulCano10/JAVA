/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

/**
 *
 * @author Raúl
 */
public class ExpresionesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
Explica qué es una expresión regular
Definición simple: 
"Una expresión regular es una secuencia de caracteres 
        que define un patrón de búsqueda en un texto. 
        Nos ayuda a verificar si una cadena 
        cumple con ciertos requisitos."

Ejemplo práctico: 
        "Por ejemplo, podemos usar una expresión regular para verificar
        si una dirección de correo electrónico contiene una @ y un .."

En Java, las expresiones regulares se manejan con las clases 
        Pattern y Matcher. 
        El método más sencillo para empezar es String.matches().             
        */
    }
    
   /**
    * String texto: La cadena que queremos validar.
    * String patron: La expresión regular que define el formato válido.
    * 
    */
    public class Validador {
        public static boolean validarTexto(String texto, String patron) {
             return texto.matches(patron);
        }
        
        //Ejemplo 1: Validar si un email es válido
        /*
        Patrón del email:
        ^ y $: Comienzo y fin de la cadena.
        [\\w._%+-]+: Uno o más caracteres permitidos antes de la @.
        @[\\w.-]+: Exactamente una @, seguida de letras, números, puntos o guiones.
        \\.[a-zA-Z]{2,6}: Un punto seguido de entre 2 y 6 letras (como .com, .es).
        */
         public static boolean validarEmail(String email) {
            // Expresión regular para validar un correo electrónico
            String patron = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
            return email.matches(patron);
        }
         
        //Ejemplo 2: Validar matrículas (formato LDDDDD)
         /*
         ^[A-Z]: Comienza con una letra mayúscula.
         \\d{5}$: Sigue con exactamente cinco dígitos hasta el final.
         Secuencias especiales que comienzan con \ en una expresión regular:

\d: Coincide con cualquier dígito (0-9).
\D: Coincide con cualquier carácter que no sea un dígito.
\w: Coincide con cualquier carácter de palabra (letras, dígitos y _).
\W: Coincide con cualquier carácter que no sea de palabra.
\s: Coincide con cualquier espacio en blanco (espacios, tabulaciones, saltos de línea).
\S: Coincide con cualquier carácter que no sea un espacio en blanco.
         
         */
         public static boolean validarMatricula(String matricula) {
             String patron = "^[A-Z]\\d{5}$";
            return matricula.matches(patron);
        }
         
    }
    
}
