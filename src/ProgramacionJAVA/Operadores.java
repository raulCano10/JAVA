/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

/**
 *
 * @author raul
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OPERADORES ARITMETICOS
        //+, -, *, /, %
        double x = 15.5;
        double y = 2;
        
        System.out.println("La Suma es: " + (x + y));
        System.out.println("La Resta es: " + (x - y));
        System.out.println("La Multiplicacion es: " + (x * y));
        System.out.println("La División es: " + (x / y));
        System.out.println("La Resto de la división es: " + (x % y));
        
        //concatenas cadenas con el +
        System.out.println("La" + "Suma" + "es: " + (x + y));               
        
        //OPERADORES CONDICIONALES
        // <, >, <=, >=, !, !=, ==, &&, ||
        int edad = 13;
        boolean mayorDeEdad = (edad >= 18); // TRUE(1) o FALSE(0)
        boolean menorDeEdad = !mayorDeEdad;
        
        if(edad >= 18){
            System.out.println("Es mayor de edad"); 
        }else{
            System.out.println("Es menor de edad"); 
        }
        
        System.out.println("¿Es mayor de edad?" + mayorDeEdad); 
        System.out.println("¿Es menor de edad?" +menorDeEdad);
        
        boolean carnetConducir = true;
        edad = 20;       
        boolean puedoConducir = carnetConducir && edad >= 18;
        
        if(carnetConducir && edad >= 18){
            System.out.println("PUEDO CONDUCIR!!!");
        }else{
            System.out.println("NO PUEDO CONDUCIR :( ");
        }
        
        if(puedoConducir){
            System.out.println("PUEDO CONDUCIR!!!");
        }else{
            System.out.println("NO PUEDO CONDUCIR :( ");
        }
        
        boolean nieva = false;
        boolean graniza = false;
        boolean llueve = true;
        
        boolean haceMalTiempo = nieva || graniza || llueve;
        if(haceMalTiempo){
            System.out.println("Hace mal tiempo. Cuidao en la carretera");
        }else{
            System.out.println("Hace buen tiempo");
        }      
        
        //(PARTE_IZQ == PARTE_DERCHA)//Igual
        int alumno1Edad = 20;
        int alumno2Edad = 21;
        //(PARTE_IZQ != PARTE_DERCHA)//Distinto
        if(alumno1Edad != alumno2Edad){
            System.out.println("Los alumnos NO tienen la misma edad");
        }       
        if(alumno1Edad == alumno2Edad){
            System.out.println("Los alumnos SI tienen la misma edad");
        }
        
       //(!PARTE_UNICA)//Distinto
       menorDeEdad = true;
        
        if(menorDeEdad){
            System.out.println("Es menor de edad");
        }
        
        if(!menorDeEdad){
            System.out.println("No es menor de edad");
        }        
        //OPERADORES DE ASIGNACION
        int a = 0;
        System.out.println(a); // a = 0
        a = a + 1;
        System.out.println(a); // a = 1
        a++;
        System.out.println(a); // a = 2
        a += 3;
        System.out.println(a); // a = 5
        a--;
        System.out.println(a); // a = 4
        int b = a++;
        System.out.println(b); // b = 4
        System.out.println(a); // a = 5
        b = ++a;
        System.out.println(b); // b = 6
        System.out.println(a); // a = 6
    }
    
}
