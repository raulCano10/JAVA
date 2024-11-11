/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

/**
 *
 * @author raul
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de cadenas de texto
        String cadena1 = "Soy un texto";
        String cadena2 = "Yo tambien soy un texto";
        
        //Concatenacion de cadenas
        String cadenasConcatenadas = cadena1 + " | "  + cadena2;
        System.out.println(cadenasConcatenadas);
        
        String cadena3 = "Hola";
        cadena3 += ", Buenos dias";
        //cadena3 = cadena3 + ", Buenos dias";
        cadena3 += " ¿Cómo estáis esta mañana?";
        System.out.println(cadena3);
        
        //Uso de variables dentro de una cadena
        String libre = "free";
        String cadena4 = "En ingles, libre se dice " + libre;
        String cadena5 = "Me gusta patinar " + libre + "style";
        System.out.println(cadena4);
        System.out.println(cadena5);
        
        //Funciones        
        //longitud de una cadena
        System.out.println("La longitud de la cadena 3 es: " + cadena3.length());
        //Paso a MAYUSCULAS de una cadena
        System.out.println("MAYUSCULAS: " + cadena3.toUpperCase());
        //Paso a minusculas de una cadena
        System.out.println("Minusculas: " + cadena3.toLowerCase());
        
        //Comparación de cadenas
        System.out.println(cadena1.compareTo(cadena2)); //Devuelve valor negativo si cadena 1 es menor que cadena 2
        System.out.println(cadena2.compareTo(cadena1)); //Devuelve valor positivo si cadena 2 es mayor que cadena 1
        System.out.println(cadena2.compareTo(cadena1)); //Devuelve valor 0 en caso de ser iguales
        
        //Extraer subcadenas de cadenas (substring)
        System.out.println(cadena3.substring(3));
        System.out.println(cadena3.substring(3,13));
        
        //Busqueda en cadenas indexOf()
        int encontrado = cadena3.indexOf("estáis");
        System.out.println(encontrado);
        System.out.println(cadena3.substring(encontrado));
        
        //Reemplazo de texto
        String texto = "Esta es la comunidad de la Región de Murcia";
        String textoReemplazado = texto.replace("comunidad", "comunidad mas bonita del mundo");
        System.out.println(textoReemplazado);
        
        //Elminar espacios en blanco (trim())
        String ejemplo1 = "       Cadena con espacion al principio y al final         ";
        String ejemplo2 = ejemplo1.trim();
        System.out.println(ejemplo1);
        System.out.println(ejemplo2);
        
        //Obtencion de caracteres
        texto = "Hola, mundo!";
        
        char primerCaracter = texto.charAt(0);
        char segundoCaracter = texto.charAt(1);
        char terceroCaracter = texto.charAt(2);
        char cuartoCaracter = texto.charAt(3);
        
        System.out.println(primerCaracter);
        System.out.println(segundoCaracter);
        System.out.println(terceroCaracter);
        System.out.println(cuartoCaracter);
        
        //Como obtengo el ultimo caracter de una cadena
        System.out.println(texto.length() - 1);
        System.out.println(texto.charAt(11));
        System.out.println(texto.charAt(texto.length() - 1));
        
        //Imprimir todos los caracteres de una cadena
        for(int i = 0; i < texto.length() ;i++){
            System.out.println(texto.charAt(i));
        }
        
        //split() para dividir una cadena en varias partes
        String frase = "Soy una frase, con unas, cuantas, comas, de mas";
        String arrayPartesFrase[] = frase.split(",");
        System.out.println(arrayPartesFrase[3]);
        
        String fraseEspacios = "Soy una frase con unas cuantas comas de mas";
        String arrayPartesFraseEspacios[] = fraseEspacios.split(" ");
        System.out.println(arrayPartesFraseEspacios[5]);
    }
    
}
