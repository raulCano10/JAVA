/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Ejemplo completo que utiliza las 10 funciones básicas de ArrayList.
 * @author Raúl
 */
public class ArrayList_EjemploCompleto {

    public static void main(String[] args) {
        // 1. Declarar y crear un ArrayList de tipo String
        ArrayList<String> lista = new ArrayList<>();

        // 2. add(X): Agregar elementos al final del ArrayList
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        // Mostrar contenido inicial
        System.out.println("Contenido inicial: " + lista); // [Elemento 1, Elemento 2, Elemento 3]

        // 3. add(posición, X): Insertar un elemento en una posición específica
        lista.add(1, "Elemento Intermedio");
        System.out.println("Después de add(1, \"Elemento Intermedio\"): " + lista); // [Elemento 1, Elemento Intermedio, Elemento 2, Elemento 3]

        // 4. get(posición): Obtener un elemento de una posición específica
        String elementoEnPosicion2 = lista.get(2);
        System.out.println("Elemento en la posición 2: " + elementoEnPosicion2); // Elemento 2

        // 5. remove(posición): Eliminar un elemento de una posición específica
        String eliminado = lista.remove(0);
        System.out.println("Elemento eliminado en posición 0: " + eliminado);
        System.out.println("Después de remove(0): " + lista); // [Elemento Intermedio, Elemento 2, Elemento 3]

        // 6. remove(X): Eliminar la primera ocurrencia de un objeto específico
        boolean eliminadoObjeto = lista.remove("Elemento 2");
        System.out.println("Se eliminó \"Elemento 2\": " + eliminadoObjeto);
        System.out.println("Después de remove(\"Elemento 2\"): " + lista); // [Elemento Intermedio, Elemento 3]

        // 7. clear(): Vaciar el ArrayList
        lista.clear();
        System.out.println("Después de clear(): " + lista); // []

        // 8. set(posición, X): Reemplazar un elemento en una posición específica
        lista.add("Original 1");
        lista.add("Original 2");
        lista.set(1, "Reemplazado");
        System.out.println("Después de set(1, \"Reemplazado\"): " + lista); // [Original 1, Reemplazado]

        // 9. contains(X): Verificar si el ArrayList contiene un elemento específico
        boolean contiene = lista.contains("Original 1");
        System.out.println("Contiene \"Original 1\": " + contiene); // true

        // 10. indexOf(X): Obtener la posición de un elemento específico
        int indice = lista.indexOf("Reemplazado");
        System.out.println("Posición de \"Reemplazado\": " + indice); // 1

        // Ejemplo práctico con entrada del usuario
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;

        System.out.println("Introduce números enteros. Escribe 0 para finalizar:");

        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            if (numero != 0) {
                numeros.add(numero);
            }
        } while (numero != 0);

        // Mostrar números ingresados
        System.out.println("Números ingresados: " + numeros);

        // Calcular suma y media
        calcularSumaYMedia(numeros);

        // Recorrer usando un iterador
        System.out.println("Recorrido con iterador:");
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    /**
     * Calcula la suma y la media de los números en un ArrayList.
     * @param numeros ArrayList de números enteros
     */
    public static void calcularSumaYMedia(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        double media = numeros.isEmpty() ? 0 : (double) suma / numeros.size();
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
