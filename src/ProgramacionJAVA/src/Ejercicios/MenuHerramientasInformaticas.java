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
public class MenuHerramientasInformaticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        
        while(continuar){        
            //pintamos el menu principal
            System.out.println("--- Menu Principal ---");
            System.out.println("1. Herramientas Informaticas");
            System.out.println("2. Salir");
            System.out.println("Selecciona una opcion (1 o 2):");
            
            //Recogemos por teclado la opcion seleccionada por el usuario
            int opcion = sc.nextInt();
            //int opcion = Integer.parseInt(sc.nextLine());
            sc.nextLine();
            /*          
                if(opcion == 1){

                }else if(opcion == 2){

                }else{
                    //Para cualquier otra opcion que no sea ni 1 ni 2
                }
            */
            switch(opcion){
                case 1:
                    //SUBMENU
                    System.out.println("--- Herramientas Informaticas ---");
                    System.out.println("a. Conversor de tamaños de Archivo");
                    System.out.println("b. Calculadora de tiempes de transferencia");
                    System.out.println("c. Simulador de Latencia de red");
                    System.out.println("Selecciona una opcion (a, b o c):");
                    
                    char opcionSubMenu = sc.next().charAt(0);
                    //String opcionSubMenu = sc.nextLine();
                    
                    switch(opcionSubMenu){
                        case 'a':
                            System.out.println("Introduce el Tamaño de archivo");
                            double tamanioArchivoMB = sc.nextDouble();
                            double tamanioArchivoKB = tamanioArchivoMB * 1024;
                            double tamanioArchivoGB = tamanioArchivoMB / 1024;
                            double tamanioArchivoTB = tamanioArchivoGB / 1024;
                                  
                            System.out.println("tamanioArchivoMB " + tamanioArchivoMB);
                            System.out.println("tamanioArchivoKB " + tamanioArchivoKB);
                            System.out.println("tamanioArchivoGB " + tamanioArchivoGB);
                            System.out.println("tamanioArchivoTB " + tamanioArchivoTB);
                            
                            break;
                        case 'b':
                            System.out.println("Introduce tamaño del archivo en MB");
                            double tamanioArchivoMB2 = sc.nextDouble();
                            System.out.println("Introduce velocidad de transferencia en Mb/seg");
                            double velocidadTrasferencia = sc.nextDouble();
                            
                            if(velocidadTrasferencia != 0){
                                double tiempo = tamanioArchivoMB2 / velocidadTrasferencia;                           
                                System.out.printf("El tiempo es %.2f", tiempo);
                            }else{
                                System.out.println("ERROR!!! La velocidad no puede ser 0");
                            }                      
                            break;
                        case 'c':
                             System.out.println("Introduce la latencia de red ms");
                            double latenciaRed = sc.nextDouble();
                            double resultado = calculaLatenciaRed(latenciaRed);
                            System.out.printf("Tiempo total latencia es %+.3f",resultado);
                            break;
                        default:
                            break;
                    }
                    
                    break;
                case 2:
                    continuar = false;
                    System.out.println("Saliendo del programa Hasta Luego!!!!");
                    break;
                default:
                    System.out.println("Opcion no valida!");
                    break;                            
            }
        }
     sc.close();
    }
    
     public static double calculaLatenciaRed(double latenciaRed){
           return (2 * latenciaRed);
     }
    
     
}
