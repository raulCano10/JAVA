/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author raul
 */
public class ArrayList_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARRAYLIST
        ArrayList nombreArray = new ArrayList();
        
        nombreArray.add("cadena de texto");
        nombreArray.add(3);
        nombreArray.add('a');
        nombreArray.add(23.5);
        
        ArrayList<String> nombreArrayString = new ArrayList();
        
        ArrayList<Integer> nombreArrayEntero = new ArrayList();
        
        
        
        ArrayList<ArrayList<Integer>> arrayLisdeArrayList = new ArrayList();
        
        //Funciones para trabajar con Arraylist
        //- size: Devuelve el tamaño del array
        //- add(X): Añade el objeto X al final y Devuelve TRUE.
        //- add(posicion,X): Aáde un objeto en la posicion indicada.
        //- remove(posicion): Elimina el elementoque se encuentra en la posicion indicada. Devuelve el elemento eliminado
        //- remove(Objeto X): Elimina la primera ocurrencia del objeto X. Devuelve TRUE si el elemento está en la lista.
        //- set(posicion, X): Sustituye el elemento que se encuentra en la posicion indicada or el objeto X. Devuelve el elemento sustituido.
        //- clear(): Elimina todos los elementos de la lista.
        //- get(posicion): Nos devuelve el elemento que se encuentra en la posicion indicada.
        //- contains(X): Comprueba si la coleccion contiene el objeto X. Devuelve true o false.
        //- indexOf(X): devuelve la posicion del objeto X. Si no existe devuelve -1
  
        ArrayList<Coche> listaCoches = new ArrayList();
        Coche coche1 = new Coche("Ferrari1");
        listaCoches.add(coche1);
        
        //Nos declaramos un arrayList de String
        ArrayList<String> lista = new ArrayList();
        String elemento1 = "Elemento1";
        String elemento2 = "Elemento2";
        String elemento3 = "Elemento3";
              
        //1. Añadir un nuevo elemento en la lista
        lista.add(elemento1);
        lista.add(elemento2);
        lista.add(elemento3);             
        
        //Mostrar contenido de la lista
        System.out.println("1. " + lista);
        
        //2. Mostar tamaño de la lista
        System.out.println("2. Tamaño de la lista: " + lista.size());
        
        //3. Añado un nuevo elemento en la poscion 2
        lista.add(2,"Elemento Nuevo");
        System.out.println("3. " +lista);
        
        //4. Obtener el elemento de una posicion concreta
        String elementoPosicion2 = lista.get(2);
        System.out.println("4. " +elementoPosicion2);
        
        //5. Eliminar el elemento de la posicion 1
        lista.remove(1);
        System.out.println("5. " +lista);
        
        //6. Eliminar un objeto concreto
        lista.remove("Elemento3");
        System.out.println("6. " +lista);
                
        //7. Limpiar una lista completamente
        lista.clear();
        System.out.println("7. " + lista);
        //7.1 Otra forma
        lista.removeAll(lista);
        
        lista.add("Coche1");
        lista.add("Coche2");
        lista.add("Coche3");
        System.out.println(lista);
        
        //8. Modificar un elemento de la lista
        lista.set(1, "CocheNuevo");
        System.out.println("8. " + lista);
        
        //9. Verificar si el ArrayList continene un elemento
        boolean existeCoche = lista.contains("Coche3");
        System.out.println("9. Coche3 existe --> " + existeCoche);
        
        //10. obtener la posicion de un elemento especifico
        int numeroPosicion = lista.indexOf("CocheNuevo");
        System.out.println("10. CocheNuevo está en la posición --> " + numeroPosicion);
         System.out.println("--------------------");
        
        //RECORRER UN ARRAYLIST
        
        //Con un bucle for
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("--------------------");
        //Con un foreach
        for(String coche : lista){
            System.out.println(coche);
        }
         System.out.println("--------------------");
         
        //Con un Iterador
        Iterator miIterador = lista.iterator();
        while(miIterador.hasNext()){
            System.out.println(miIterador.next());
        }
    }
    
}
