/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ra�l
 */
public class ArrayList_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARACI�N Y CREACI�N DE UN ARRAYLIST
        
        //Puede contener cualquier tipo de dato
        ArrayList a = new ArrayList();   
        a.add("Lenguaje");
        a.add(3);
        a.add('a');
        a.add(23.5);

        //Creamos un arraylist de cadenas
        ArrayList<String> cadenas =new ArrayList<>();
        
        //Creamos un arraylist de numeros
        ArrayList<Integer> num = new ArrayList<>();
        
        //Funciones para trabajar con arrays
        //1. size() --> Devuelve el n�mero de elementos (int)
        //2. add(X) --> A�ade el objeto X al final. Devuelve true.
        //3. add(posici�n, X) --> Inserta el objeto X en la posici�n indicada.
        //4. get(posicion) --> Devuelve el elemento que est� en la posici�n indicada.
        //5. remove(posicion) --> Elimina el elemento que se encuentra en la posici�n indicada. Devuelve el elemento eliminado.
        //6. remove(X) --> Elimina la primera ocurrencia del objeto X. Devuelve true si el elemento est� en la lista.
        //7. clear() --> Elimina todos los elementos.
        //8. set(posici�n, X) --> Sustituye el elemento que se encuentra en la posici�n indicada por el objeto X. Devuelve el elemento sustituido.
        //9. contains(X) --> Comprueba si la colecci�n contiene al objeto X. Devuelve true o false.
        //10. indexOf(X) --> Devuelve la posici�n del objeto X. Si no existe devuelve -1
        
        //RECORRER UN ARRAYLIST       
        
        //Con un buble FOR
        for(int i = 0;i < cadenas.size();i++){
            System.out.println(cadenas.get(i));      
        }
        
        //Con un bucle foreach
        //Si el array contiene objetos de tipos distintos o desconocemos el tipo:
        for(Object n: num){
            System.out.println(n);                 
        }
        
        //Utilizando un objeto Iterator.
        /*
        La ventaja de utilizar un Iterador es que no necesitamos indicar el tipo de objetos que contiene el array.
        Iterator tiene como m�todos:
        hasNext: devuelve true si hay m�s elementos en el array.
        next: devuelve el siguiente objeto contenido en el array.
        */
        Iterator ite = num.iterator();       //se crea el iterador it para recorrer el array numeros                   
        while(ite.hasNext()){                    //mientras queden elementos
              System.out.println(ite.next());    //se obtienen y se muestran                                               
        }
        
        
        
        //EJEMPLO 1
        //Ejemplo 1:
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luisa");
        nombres.add("Felipe");
        
        System.out.println(nombres); // [Ana, Luisa, Felipe]
        
        nombres.add(1, "Pablo");
        System.out.println(nombres); // [Ana, Pablo, Luisa, Felipe]  
        
        nombres.remove(0);
        System.out.println(nombres); // [Pablo, Luisa, Felipe]
        
        nombres.set(0,"Alfonso");    
        System.out.println(nombres); // [Alfonso, Luisa, Felipe]  
        
        String primero = nombres.get(1);
        String ultimo = nombres.get(nombres.size() - 1);
        System.out.println("El primero es " + primero + " y el �ltimo es " + ultimo);  // Luisa Felipe
        
    //EJEMPLO 2
    //Escribe un programa que lea n�meros enteros 
    //y los guarde en un ArrayList hasta que se lea un 0 
    //y muestra:
    //1. Los n�meros le�dos
    //2. su suma
    //3. Y crea una funcion que calcule su media
    
    Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int n;
  
        do {
            System.out.println("Introduce n�meros enteros. 0 para acabar: ");                                     
            System.out.println("Numero: ");
            n = sc.nextInt();
            if (n != 0){
                numeros.add(n);
            }
        }while (n != 0);
       
        System.out.println("Ha introducido: " + numeros.size() + " n�meros:");
        
        //mostrar el arrayList completo
        System.out.println(numeros);
       
        //recorrido usando un iterador para mostrar un elemento por l�nea                                         
        Iterator it = numeros.iterator();
        while(it.hasNext()){
              System.out.println(it.next());
        }
  
        calcularMedia(numeros);
        
    }
    
    public static void calcularMedia(ArrayList<Integer> numeros){
        //recorrido usando foreach para sumar los elementos
        double suma = 0;
        for(Integer i: numeros){
            suma = suma + i;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + suma/numeros.size());
    }
    
}
