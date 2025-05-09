/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

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
        int [] arrayEnteros = {1,2,3,4,5};
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
    }
    
}
