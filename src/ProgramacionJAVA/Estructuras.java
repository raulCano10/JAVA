/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

/**
 *
 * @author raul
 */
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estrutura secuencial.
        int num = -4;
        int a = 1;
        int b = 2;
        System.out.println(a + b);
        
        //Estructura condición
        //num = 4;
        String mensaje = (num > 3) ? "El numero vale mas de 3" : "El numero vale MENOS de 3";
        System.out.println(mensaje);
        
        //Estructura Switch
        switch(num){
            case 1:
            case 2:
            case 3:
                System.out.println(num);
                break;
            default:
                System.out.println("El valor es diferente a 3");
                break;
        }
        
        num = 5;
        //Estructura Switch 2
        switch(num){
            case 1, 2, 3 -> System.out.println(num);
            default -> System.out.println("El valor es mayo que 3");
        }
        
        //Condicional simple
        if(num > 10){
            System.out.println("El valor es mayor que 10");
        }
        
        //Condicional
        if(num > 10){
            System.out.println("El valor es mayo que 10");
        }else{
            System.out.println("El valor es menor que 10");
        }
        
        //Condicional Anidado
        if(num < 10){
            System.out.println("El valor es mayo que 10");
        }else if(num > 200){
            System.out.println("El valor es mayor que 200");
        }else{
            System.out.println("El valor está entre 10 y 200");
        }
        
        //IF - ELSE
        int golesEquipo1 = 2;
        int golesEquipo2 = 5;
        if(golesEquipo1 > golesEquipo2){
            System.out.println("Gana equipo 1");
        }else{
            System.out.println("Gana equipo 2");
        }
        
        //IF - ELSE anidados
        golesEquipo1 = 4;
        golesEquipo2 = 1;
        if(golesEquipo1 > golesEquipo2){
            System.out.println("Gana equipo 1");
        }else if(golesEquipo2 > golesEquipo1){
            System.out.println("Gana equipo 2");
        }else{
            System.out.println("Empate");
        }
               
        // Mientras el contador sea menor que 5, se ejecuta el ciclo
        int contador = 5;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;  // Incrementa el contador
        }
        
        // Se ejecuta al menos una vez, independientemente de la condición
        do {
            System.out.println("Contador: " + contador);
            contador++;  // Incrementa el contador
        } while (contador < 5);  // Verifica la condición después de cada iteración
        
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;  // Sale del bucle cuando i es igual a 5
            }
            System.out.println("i: " + i);
        }
        System.out.println("Bucle terminado.");
        
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;  // Salta la iteración cuando i es igual a 5
            }
            System.out.println("i: " + i);
        }
        
           
    }
    
}
