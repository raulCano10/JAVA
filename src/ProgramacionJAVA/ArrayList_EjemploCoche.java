/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import Clases.Coche;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ejemplo completo que utiliza las 10 funciones b�sicas de ArrayList.
 * @author Ra�l
 */
public class ArrayList_EjemploCoche {

    public static void main(String[] args) {
        // 1. Declarar y crear un ArrayList de tipo Coche
        ArrayList<Coche> listaCoches = new ArrayList<>();

        Coche coche1 = new Coche("SEAT");
        Coche coche2 = new Coche("AUDI");
        Coche coche3 = new Coche("CITROEN");
        
        // 2. add(X): Agregar elementos al final del ArrayList
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);

        // Mostrar contenido inicial
        System.out.println("Contenido inicial: " + listaCoches); // [Elemento 1, Elemento 2, Elemento 3]

        // 3. add(posici�n, X): Insertar un elemento en una posici�n espec�fica
        listaCoches.add(1, new Coche("LEXUS"));
        System.out.println("Despu�s de add(1, \"new Coche(\"LEXUS\")\"): " + listaCoches); // [Elemento 1, Elemento Intermedio, Elemento 2, Elemento 3]

        // 4. get(posici�n): Obtener un elemento de una posici�n espec�fica
        Coche cocheEnPosicion2 = listaCoches.get(2);
        System.out.println("Coche en la posici�n 2: " + cocheEnPosicion2); // Elemento 2

        // 5. remove(posici�n): Eliminar un elemento de una posici�n espec�fica
        Coche cocheEliminado = listaCoches.remove(0);
        System.out.println("Elemento eliminado en posici�n 0: " + cocheEliminado);
        System.out.println("Despu�s de remove(0): " + listaCoches); // [Elemento Intermedio, Elemento 2, Elemento 3]

        // 6. remove(X): Eliminar la primera ocurrencia de un objeto espec�fico
        boolean eliminadoObjeto = listaCoches.remove(coche3);
        System.out.println("Se elimin� \"Elemento 2\": " + eliminadoObjeto);
        System.out.println("Despu�s de remove(\"Elemento 2\"): " + listaCoches); // [Elemento Intermedio, Elemento 3]

        // 7. clear(): Vaciar el ArrayList
        listaCoches.clear();
        System.out.println("Despu�s de clear(): " + listaCoches); // []

        // 8. set(posici�n, X): Reemplazar un elemento en una posici�n espec�fica
        Coche coche4 = new Coche("MERCEDES");
        Coche coche5 = new Coche("FERRARI");
        Coche coche6 = new Coche("FORD");
        listaCoches.add(coche4);
        listaCoches.add(coche5);
        listaCoches.set(1, coche6);
        System.out.println("Despu�s de set(1, \"Reemplazado\"): " + listaCoches); // [Original 1, Reemplazado]

        // 9. contains(X): Verificar si el ArrayList contiene un elemento espec�fico
        boolean contiene = listaCoches.contains(coche4);
        System.out.println("Contiene \"Original 1\": " + contiene); // true

        // 10. indexOf(X): Obtener la posici�n de un elemento espec�fico
        int indice = listaCoches.indexOf(coche4);
        System.out.println("Posici�n de \"Reemplazado\": " + indice); // 1      
    
        // Recorrer usando un iterador
        System.out.println("Recorrido con iterador:");
        Iterator<Coche> it = listaCoches.iterator();
        while (it.hasNext()) {
            it.next().pintaInfo();
        }
        
        for (Coche coche : listaCoches) {
            coche.pintaInfo();
        }
    }

}
