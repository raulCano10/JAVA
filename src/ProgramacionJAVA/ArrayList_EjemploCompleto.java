/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Ejemplo completo que utiliza las 10 funciones b�sicas de ArrayList.
 * @author Ra�l
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

        // 3. add(posici�n, X): Insertar un elemento en una posici�n espec�fica
        lista.add(1, "Elemento Intermedio");
        System.out.println("Despu�s de add(1, \"Elemento Intermedio\"): " + lista); // [Elemento 1, Elemento Intermedio, Elemento 2, Elemento 3]

        // 4. get(posici�n): Obtener un elemento de una posici�n espec�fica
        String elementoEnPosicion2 = lista.get(2);
        System.out.println("Elemento en la posici�n 2: " + elementoEnPosicion2); // Elemento 2

        // 5. remove(posici�n): Eliminar un elemento de una posici�n espec�fica
        String eliminado = lista.remove(0);
        System.out.println("Elemento eliminado en posici�n 0: " + eliminado);
        System.out.println("Despu�s de remove(0): " + lista); // [Elemento Intermedio, Elemento 2, Elemento 3]

        // 6. remove(X): Eliminar la primera ocurrencia de un objeto espec�fico
        boolean eliminadoObjeto = lista.remove("Elemento 2");
        System.out.println("Se elimin� \"Elemento 2\": " + eliminadoObjeto);
        System.out.println("Despu�s de remove(\"Elemento 2\"): " + lista); // [Elemento Intermedio, Elemento 3]

        // 7. clear(): Vaciar el ArrayList
        lista.clear();
        System.out.println("Despu�s de clear(): " + lista); // []

        // 8. set(posici�n, X): Reemplazar un elemento en una posici�n espec�fica
        lista.add("Original 1");
        lista.add("Original 2");
        lista.set(1, "Reemplazado");
        System.out.println("Despu�s de set(1, \"Reemplazado\"): " + lista); // [Original 1, Reemplazado]

        // 9. contains(X): Verificar si el ArrayList contiene un elemento espec�fico
        boolean contiene = lista.contains("Original 1");
        System.out.println("Contiene \"Original 1\": " + contiene); // true

        // 10. indexOf(X): Obtener la posici�n de un elemento espec�fico
        int indice = lista.indexOf("Reemplazado");
        System.out.println("Posici�n de \"Reemplazado\": " + indice); // 1

        // Ejemplo pr�ctico con entrada del usuario
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;

        System.out.println("Introduce n�meros enteros. Escribe 0 para finalizar:");

        do {
            System.out.print("N�mero: ");
            numero = sc.nextInt();
            if (numero != 0) {
                numeros.add(numero);
            }
        } while (numero != 0);

        // Mostrar n�meros ingresados
        System.out.println("N�meros ingresados: " + numeros);

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
     * Calcula la suma y la media de los n�meros en un ArrayList.
     * @param numeros ArrayList de n�meros enteros
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
