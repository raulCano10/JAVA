/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

//Hay que importar las clases que quiera utilizar
import Clases.Coche;

/**
 *
 * @author raul
 */
public class POO_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciar una clase
        //Crear un objeto de esa clase
        //Nombre de la clase
        //Variable como queramos llamarla
        //new
        //Se Llama al contructor
        Coche coche1 = new Coche("SEAT", "IBIZA");
        //coche1.numRuedas = 3;
        Coche.getDescuento();
        System.out.println("numero ruedas = " + coche1.getNumRuedas());
        coche1.marca = "MI MARCA!!";
        //coche1.modelo = "MI MODELO";
        coche1.setModelo("MI MODELO");
        
        //¿Como accdemos a las propiedades del objeto?
        //ystem.out.println("La marca de coche1 es " + coche1.marca);
        //System.out.println("El modelo de coche1 es " + coche1.modelo);
        
        //coche1.marca = "SEAT";
        //coche1.modelo = "IBIZA";
        coche1.setMarca("SEAT");
        coche1.setModelo("IBIZA");
        
        //System.out.println("La marca de coche1 es " + coche1.marca);
        //System.out.println("El modelo de coche1 es " + coche1.modelo);
        System.out.println("La marca de coche1 es " + coche1.getMarca());
        System.out.println("El modelo de coche1 es " + coche1.getModelo());
        
        Coche coche2 = new Coche("AUDI","Q230");
        Coche coche10 = new Coche("AUDI",4);
        //coche2.marca = "AUDI";
        //coche2.modelo = "Q5";
        //coche2.setMarca("AUDI");
        coche2.setModelo("Q5");
        //System.out.println("La marca de coche2 es " + coche2.marca);
        //System.out.println("El modelo de coche2 es " + coche2.modelo);
        System.out.println("La marca de coche2 es " + coche2.getMarca());
        System.out.println("El modelo de coche2 es " + coche2.getModelo());
        
        Coche coche3 = new Coche("CITROEN","C4");
        //System.out.println("La marca de coche3 es " + coche3.marca);
        //System.out.println("El modelo de coche3 es " + coche3.modelo);
        System.out.println("La marca de coche3 es " + coche3.getMarca());
        System.out.println("El modelo de coche3 es " + coche3.getModelo());
        coche3.pintaInfo();
        
    }
    
}
