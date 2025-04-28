/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

/**
 *
 * @author raul
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        
        //int c = a + b;
        int c = suma(a,b);
        
        System.out.println("La suma de a + b es: " + c);
        
        int a2 = 8;
        int b2 = 16;
        
        int c2 = a2 + b2;
        
        
        System.out.println("La suma de a2 + b2 es: " + c2);
        
        int c3 = 6 + 8;             
        
        
        int c4 = suma(45,67);
        System.out.println("La suma es igual a: " + c4);
        
        //boolean esPar = esPar(43);
        if(esPar(43)){
            System.out.println("EL NUMERO ES PAR");
        }else{
            System.out.println("EL NUMERO ES IMPAR");
        }
        
    }
    
    //La funcion que crees se declara fuera del main()
    public static int suma(int a, int b){
        return a + b;
    }
    
    //Ejemplo de una funcion que devuelve un double
    public static double dameGradosFarenheit(double gradosCelsius){
        return (gradosCelsius * 9/5) + 32;
    }
   
    //Ejemplo de una funcion que devuelve un boolean
    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
    
    //Ejemplo de una funcion que devuelve un string
    
    //Ejemplo de una fucion que no devuelve nada
    public static void pintarPorConsolaSiEsImparPar(int numero){
        if(esPar(43)){
            System.out.println("EL NUMERO ES PAR");
        }else{
            System.out.println("EL NUMERO ES IMPAR");
        }
    }
}
