/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import Clases.Coche;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Ejemplo completo que utiliza las 10 funciones básicas de ArrayList.
 * @author Raúl
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

        // 3. add(posición, X): Insertar un elemento en una posición específica
        listaCoches.add(1, new Coche("LEXUS"));
        System.out.println("Después de add(1, \"new Coche(\"LEXUS\")\"): " + listaCoches); // [Elemento 1, Elemento Intermedio, Elemento 2, Elemento 3]

        // 4. get(posición): Obtener un elemento de una posición específica
        Coche cocheEnPosicion2 = listaCoches.get(2);
        System.out.println("Coche en la posición 2: " + cocheEnPosicion2); // Elemento 2

        // 5. remove(posición): Eliminar un elemento de una posición específica
        Coche cocheEliminado = listaCoches.remove(0);
        System.out.println("Elemento eliminado en posición 0: " + cocheEliminado);
        System.out.println("Después de remove(0): " + listaCoches); // [Elemento Intermedio, Elemento 2, Elemento 3]

        // 6. remove(X): Eliminar la primera ocurrencia de un objeto específico
        boolean eliminadoObjeto = listaCoches.remove(coche3);
        System.out.println("Se eliminó \"Elemento 2\": " + eliminadoObjeto);
        System.out.println("Después de remove(\"Elemento 2\"): " + listaCoches); // [Elemento Intermedio, Elemento 3]

        // 7. clear(): Vaciar el ArrayList
        listaCoches.clear();
        System.out.println("Después de clear(): " + listaCoches); // []

        // 8. set(posición, X): Reemplazar un elemento en una posición específica
        Coche coche4 = new Coche("MERCEDES");
        Coche coche5 = new Coche("FERRARI");
        Coche coche6 = new Coche("FORD");
        listaCoches.add(coche4);
        listaCoches.add(coche5);
        listaCoches.set(1, coche6);
        System.out.println("Después de set(1, \"Reemplazado\"): " + listaCoches); // [Original 1, Reemplazado]

        // 9. contains(X): Verificar si el ArrayList contiene un elemento específico
        boolean contiene = listaCoches.contains(coche4);
        System.out.println("Contiene \"Original 1\": " + contiene); // true

        // 10. indexOf(X): Obtener la posición de un elemento específico
        int indice = listaCoches.indexOf(coche4);
        System.out.println("Posición de \"Reemplazado\": " + indice); // 1      
    
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
