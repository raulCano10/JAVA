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
public class ArrayList_EjemploCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declarar una arrayList de coches
        ArrayList<Coche> listaCoches = new ArrayList();
        
        Coche coche1 = new Coche("SEAT");
        Coche coche2 = new Coche("AUDI");
        Coche coche3 = new Coche("CITROEN");
        
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        
        //Pintar la info de la lista de coches
        for(Coche miCoche : listaCoches){
            miCoche.pintaInfo();
        }
        
        System.out.println("--------------------------");
        
        //Iterator
        Iterator<Coche> miIterador = listaCoches.iterator();
        while(miIterador.hasNext()){
            miIterador.next().pintaInfo();
        }
    System.out.println("--------------------------");
        //Añadir nuevo coche en la posicion 2
        listaCoches.add(2, new Coche("LEXUS"));
        
        Coche coche4 = new Coche("LEXUS");
        listaCoches.add(2, coche4);
        listaCoches.add(2, coche4);
        listaCoches.add(2, coche4);
        listaCoches.add(2, coche4);
        listaCoches.add(2, coche4);
        
        coche4.setModelo("MODELO1");
        //Pintar la info de la lista de coches
        for(Coche miCoche : listaCoches){
            miCoche.pintaInfo();
        }
        
         System.out.println("--------------------------");
         
         System.out.println(listaCoches);
         
         //Obtengo el coche que está en la posicion 2
         Coche cochePosicion2 = listaCoches.get(2);
         System.out.println(cochePosicion2);
         cochePosicion2.pintaInfo();
         
         //Eliminar un che del array
         Coche cocheEliminado = listaCoches.remove(2);
         cocheEliminado.pintaInfo();
         
         //Modificar el coche de la posicion 6
         listaCoches.set(6, coche1);
         System.out.println(listaCoches);
         //Como verificar si existe o no un coche en el arraylist de coches
         boolean existeElCoche1 = listaCoches.contains(coche1);
         System.out.println("¿Existe el coche 1? " + existeElCoche1);
         
         int posicionCoche1 = listaCoches.indexOf(coche1);
         System.out.println("EL coche 1 se encuentra en la posicion " + posicionCoche1);
         
         listaCoches.remove(0);
         
         int posicionCoche1otravez = listaCoches.indexOf(coche1);
         System.out.println("EL coche 1 se encuentra en la posicion " + posicionCoche1otravez);
         
         listaCoches.remove(5);
         
         int posicionCoche1otravezMas = listaCoches.indexOf(coche1);
         System.out.println("EL coche 1 se encuentra en la posicion " + posicionCoche1otravezMas);
         
         //vaciar la lista completa
         listaCoches.removeAll(listaCoches);
         listaCoches.clear();
    }
}
