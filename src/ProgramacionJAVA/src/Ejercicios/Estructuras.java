/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
        //Calcula la media aritmetica de 3 numeros pedido por teclado
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce numero 1");
        double numero1 = sc.nextDouble();
        
        //double numero1_A = Double.parseDouble(sc.nextLine());
        //int numeroEntero = Integer.parseInt(sc.nextLine());
               
        System.out.println("Introduce numero 2");
        double numero2 = sc.nextDouble();
        
        
        System.out.println("Introduce numero 3");
        double numero3 = sc.nextDouble();
        
        double suma = numero1 + numero2 + numero3;
        
        double media = suma/3;
        
        System.out.println("La media es:" + media);
        
        //Ejercicio mejorado: Calcula la media aritmetica de N numeros pedido por teclado
        Scanner sc2 = new Scanner(System.in);
        double suma1 = 0;
        
        System.out.println("Introduce la cantidad de numeros:");
        int n = sc2.nextInt(); //n = 4
        
        for(int i = 1; i <= n; i++){
            double numero = sc.nextDouble();
            //suma = suma + numero;
            suma1 += numero;
        }
        
        double media2 = suma1/n;
        System.out.println("La media es:" + media2);
        
        //Ejercicio 2
        //Calcular el perimetro y area de un rectangulo dada su base y su altura
        //perimetro suma de los lados
        //area base x altura
        
        System.out.println("Introduce la base:");
        double base = sc.nextDouble();
        
        System.out.println("Introduce la altura:");
        double altura = sc.nextDouble();
        
        //Calcula area
        double area = base*altura;        
         
        //calcula  el perimetro
        double perimetro = base + base + altura + altura;
        //2*(base + altura)
        
        System.out.println("El area del rectangulo es:" + area);
        System.out.println("El parimetro del rectangulo es:" + perimetro);
        
        //Ejercicio 3
        //Una tienda ofrece un descuento del 15% sobre el total de la compra
        // y un cliente desea saber cuanto deberá pagar finalmente por su compra.
        // 1. Introducir por teclado el total compra
        // 2. Calcular cuanto cuesta con el descuento
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduce el total de la compra (precio sin descuento)");
        double precioSinDescuento = sc3.nextDouble();
        
        //Calcular el descuento
        double descuento = precioSinDescuento * 0.15;
        double precioFinal = precioSinDescuento - descuento;
        
        System.out.println("El precio sin descuento es " + precioSinDescuento);
        System.out.println("El precio final con descuento es " + precioFinal);
        System.out.println("El descuento es " + descuento);
        
        /*
        Ejercicio 4
        Ecribe un programa que convierta un valor en grados Fahrenheit a grados celsius
        La formula de conversion es C = (F-32)*5/9
        Hacerlo con Menu.
        
        ------------------------------------------------
        CONVERSOR DE GRADOS - CELSIUS y CELSIUS - GRADOS
        -------------------------------------------------
        1. Convertir grados a celsius
        2. convertir celsius a grados
        3. Salir
        
        Si pulsas 1 que te pide los grados y te calcule los celsius
        Si pulsas 3 que te pida los celsius y te calcule los grados.
        
        60ºF
        30ºC
        */
        
        Scanner sc4 = new Scanner(System.in);
        
        System.out.println("Seleccione la conversión que desea realizar:");
        System.out.println("1. Fahrenheit a Celsius.");
        System.out.println("2. Celsius a Fahrenheit.");
        System.out.println("3. Salir.");
        
        int opcionSeleccionada = 0;
        do{
            opcionSeleccionada = sc.nextInt();

            if(opcionSeleccionada == 1){
                System.out.println("Introduzca el valor en grados Fahrenheit");
                double gradosFahrenheit = sc.nextDouble();
                double gradosCelsius = (gradosFahrenheit - 32)*5/9;
                System.out.println(gradosFahrenheit + " grados Fahrenheit equivalen a "
                        + gradosCelsius + " grados celsius");
            }else if(opcionSeleccionada == 2){
                System.out.println("Introduzca el valor en grados Celsius");
                double gradosCelsius = sc.nextDouble();
                double gradosFahrenheit = (gradosCelsius * 9/5) + 32;
                double gradosFahrenheitDesdeFuncion = ProgramacionJAVA.Funciones.dameGradosFarenheit(gradosCelsius);
                System.out.println(gradosCelsius + " grados Celsius equivalen a "
                        + gradosFahrenheit + " grados Fahrenheit");
            }else{
                System.out.println("Saliendo...");
            }
        }while(opcionSeleccionada != 3);
        
        //Hacer un programa que te vaya pidiendo numeros por pantalla
        // te indique sus divisores. 
        //El programa finaliza cuando introducimos un 0
        
        /*
        Ejemplo:
          CALCULO DE DIVISORES
        ========================
        Dime un numero (0 para salir): 6
        El numero 1 es divisor de 6
        El numero 2 es divisor de 6
        El numero 3 es divisor de 6
        El numero 6 es divisor de 6
        
        Dime un numero (0 para salir): 2
        El numero 1 es divisor de 2
        El numero 2 es divisor de 2
        
        Dime un numero (0 para salir): 0
        !!FIN!!
        
        */
        while(true){
            System.out.println("CALCULO DE DIVISORE");
            System.out.println("====================");
            System.out.println("Dime un numero (0 para salir):");
            sc = new Scanner(System.in);
            int numero = sc.nextInt();

            if(numero == 0){
                System.out.println("!!FIN!!");   
                break;
            }

            for(int i = 1; i <= numero; i++){
                if(numero % i == 0){
                    System.out.println("El numero "+ i +" es divisor de " + numero +"");
                }
            }
        }
        
        int numero;
        do{
            System.out.println("CALCULO DE DIVISORE");
            System.out.println("====================");
            System.out.println("Dime un numero (0 para salir):");
            sc = new Scanner(System.in);
            numero = sc.nextInt();

            if(numero == 0){
                System.out.println("!!FIN!!");                 
            }

            for(int i = 1; i <= numero; i++){
                if(numero % i == 0){
                    System.out.println("El numero "+ i +" es divisor de " + numero +"");
                }
            }
        }while(numero != 0);
        
        /*
            Pedir el nombre y apellidos por teclado
            y mostrar por pantalla las inciales
        Ejemplo:
            Nombre:
                Raul
            Apellido1:
                Cano 
            Apellido2:
                Serrano
            Iniciales: R.S.C
        */       

        //char Nombre = nombre.chaAt(0);
        
        /*
        Un alumno quiere saber su calificacion final
        La calificacion se compone de los siguientes porcentajes:
            - 55% promedio de los tres parciales
            - 30% examen final
            - 15% tabajo final
        Pide por teclado:
            1. Las 3 notas de los tres parciales.
            2. La nota del examen final.
            3. La nota del trabajo final
         Calcula la calificacion final
         Redondea la calificacion final con 2 decimales.
        */
        Scanner sc5 = new Scanner(System.in);
        
        System.out.println("Introduce las tres calificaciones de los parciales:");
        double parcial1 = sc5.nextDouble();
        double parcial2 = sc5.nextDouble();
        double parcial3 = sc5.nextDouble();
        System.out.println("Introduce la nota final del examen:");
        double notaFinalExamen = sc5.nextDouble();
        System.out.println("Introduce la nota del tabajo final:");
        double notaTrabajoFinal = sc5.nextDouble();
        
        double mediaParciales = (parcial1 + parcial2 + parcial3)/3;
        
        double calificacionFinal = (mediaParciales * 0.55) + (notaFinalExamen * 0.30)
                + (notaTrabajoFinal * 0.15);
        
        System.out.println("La calificacion final es:" + calificacionFinal);
        
        //Redeondear a 2 decimales
        
        System.out.printf("La calificacion final redondeada "
                + " a 2 decimales es %.2f:" + calificacionFinal);
        
        /*
            Pide por teclado 2 numeros A y B
            Intercabia los valores de e imprimelos por consola
        
            Ejemplo:
            Si A = 3 y B = 6
            Al imprimir A se tiene que mostrar un 6.
            Al imprimir B se tiene que mostrar un 3.
        */
        
        /*
            Solicita al usuario que introduzca una fecha en formato YYYY-MM-DD
            por teclado como cadena de texto.       
            usa split para separar año, mes y dia.       
            Convierte los valores separados en enteros con Integer.parseInt          
             VALIDA QUE:
            1. El año debe ser mayor que 1900 y menor que 2100
            2. El mes debe estar entre 1 y 12
            3. El día debe ser válido para el mes indicado (considera años bisiestos)
            4. Imprime la fecha en un formato más legible: DD/MM/YYYY
        
        NOTA: Un año es bisiesto si se cumplen las siguientes condiciones:
        1. Es divisible por 4.
        2. Si el año se puede dividir entre 4 y no es divisible por 100.
        3. O bien si el año es multiplo de 400.
            
        IMPORTANTE: 
        Para hacer el ejercicion crea una FUNCION llamada
        esDiaValido() pasando por parámetro el dia, el mes y el año.
        array int[] diasPorMes = [31,28,31,30,.......etc]
        Crear tambien una funcion llamada esBisiesto() donde le pases el 
        año por parámetro y te diga si es o no bisiesto con un boelano.   
        */
        
    }
    
    
  
    
}
