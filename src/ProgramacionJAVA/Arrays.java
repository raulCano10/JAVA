/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARRAYS UNIDIMENSIONALES
        
        String[] animales = {"perro", "gato", "conejo", "león"};
        
        //Muestro los valores del array.
        System.out.println(animales[0]);
        System.out.println(animales[1]);
        System.out.println(animales[2]);
        System.out.println(animales[3]);
        //System.out.println(animales[4]);
        
        //Recorrer un array mediante un for
        for(int i = 0; i < animales.length; i++){
            System.out.println(animales[i]);
        }
        
        //CREAR ARRAYS UNIDIMENSIONALES
         int [] ventas = new int[5];  //array de datos de tipo int llamado ventas
        double [] temperaturas;  //array de datos de tipo double llamado temperaturas   
        String [] nombres; //array de datos de tipo String llamado nombres
        
        int [] A = new int [5];
        //reservo 5 espacios de memoria para A
        

        //INICIALIZAR ARRAYS
        double [] notas = {6.7, 7.5, 5.3, 8.75, 3.6, 6.5};   
        String [] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"}; 
        boolean [] resultados = {true,false,true,false};
        
        //Si se intenta acceder a un elemento que está fuera de los límites del array 
        //(un elemento con índice negativo o con un índice mayor que el que corresponde al último elemento del array) 
        //el compilador no avisa del error. El error se producirá durante la ejecución.
        
        //RECORRER UN ARRAY UNIDIMENSIONAL
        double[] notas2 = {2.3, 8.5, 3.2, 9.5, 4, 5.5, 7.0}; //array de 7 elementos
        for (int i = 0; i < 7; i++) {                                                                                     
             System.out.print(notas2[i] + " "); //se muestra cada elemento del array                                       
        }
        
        double[] notas3 = {2.3, 8.5, 3.2, 9.5, 4, 5.5, 7.0}; //array de 7 elementos
        for (int i = 0; i < notas3.length; i++) {                                                                          
            System.out.print(notas3[i] + " "); //se muestra cada elemento del array                                       
        }
        
        
        //Recorrer un Array en java con foreach. Bucle for para colecciones
        Scanner sc3 = new Scanner(System.in);
        double [] temperatura = new double[10];
        int i1;
  
        for(i1 = 0; i1 < temperatura.length; i1++){
            System.out.print("Elemento " + i1 + ": ");                                                             
            temperatura[i1] = sc3.nextDouble();         
        }

        for(double t: temperatura){
            System.out.print(t + " ");                                                                            
        }
        System.out.println();   
    }
    
}
