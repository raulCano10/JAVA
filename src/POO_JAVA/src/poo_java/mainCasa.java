/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.Casa;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class mainCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           
       
       Scanner sc = new Scanner(System.in);
        
       //Definir un array de casas (50 elementos máximo)
       Casa[] casas = new Casa[50];
       
       casas[0] = new Casa("Juan", 30, 45, 120000);
       casas[1] = new Casa("Pedro", 120, 0, 1000000);
       casas[2] = new Casa("Alicia", 70, 70, 150000);
       
       casas[38] = new Casa("Paco", 30, 70, 150000);
       
       //Imprime temporalmente los datos de las tres casas con un for
       for(int i = 0; i < casas.length; i++){
           if(casas[i] != null){
               System.out.println("");
               casas[i].imprimirDatos();
           }      
       }
       
       
        
     int opcion = 0;
     
    do{
        try
        {
           
                System.out.println("=========================");
                System.out.println("       MENU CASAS        ");
                System.out.println("=========================");
                System.out.println("1. Añadir Casa");
                System.out.println("2. Listar Casas");
                System.out.println("3. Cambiar Propietario");
                System.out.println("4. Salir");
                System.out.println("5. Buscar casas");

                System.out.println("Elige una opcion");
                
                //int opcion = sc.nextInt();
                if(opcion == 0){
                    opcion = Integer.parseInt(sc.nextLine());
                }
                
                
                //Salta un error
                switch(opcion){
                    case 1:
                        //Añadir una casa
                        System.out.print("Introduce nuevo propietario: ");
                        String propietario = sc.nextLine();
                        System.out.print("Introduce superficie planta 1: ");
                        int supPlanta1 = Integer.parseInt(sc.nextLine());
                        System.out.print("Introduce superficie planta 2: ");
                        int supPlanta2 = Integer.parseInt(sc.nextLine());;
                        System.out.println("Introduce Precio de Venta:");
                        double precioVenta = Double.parseDouble(sc.nextLine());

                        //Recorremo el array 
                        // y si hay alguno vacío lo insertamos y salimos del for
                        for(int i = 0; i < casas.length; i++){
                            if(casas[i] == null){
                                casas[i] = new Casa(propietario,supPlanta1, supPlanta2, precioVenta);
                                break;
                            }
                        }
                        System.out.println("Nueva casa añadida correctamente...");
                        break;
                    case 2:
                        System.out.println("=== Listado de casas ===");
                        for(int i = 0; i < casas.length; i++){
                            if(casas[i] != null){
                                casas[i].imprimirDatos();
                            }
                        }
                        break;
                    case 3:
                        try{
                            //Cambiar propietario
                            System.out.print("Introduce el numero de casa:");
                            int numeroCasa = Integer.parseInt(sc.nextLine());

                            //CASA ANTES DE CAMBIAR DE PROPIETARIO
                            System.out.println("Va a cambiar el propietario de la casa:");
                            casas[numeroCasa-1].imprimirDatos();

                            System.out.print("Introduce nuevo propietario:");
                            String nuevoPropietario = sc.nextLine();

                            casas[numeroCasa-1].setPropietario(nuevoPropietario);

                            //CASA DESPUES DE CAMBIAR DE PROPIETARIO
                            System.out.println("Ha cambiado el propietario de la casa:");
                            casas[numeroCasa-1].imprimirDatos();
                        }catch(Exception ex){
                            System.out.println("ERROR.- " + ex.getMessage());
                        }                                
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    case 5:
                        //pedir el precio maximo por teclado
                        System.out.print("Introduce un precio Máximo: ");
                        double precioMaximo = Double.parseDouble(sc.nextLine());
                        //double precioMaximo = sc.nextDouble();
                        // llamar a la funcion buscarCasas
                        buscarCasas(casas,precioMaximo);
                        break;
                    default:
                        System.out.println("Opcion no valida. Introduce un numero del 1 al 5");
                        break;

                }
                opcion = 0;
                
        }
        catch(Exception ex){
              System.out.println("ERROR CONTINUA");
                
        }finally{
             opcion = 0;
             sc.close();
        }
        }while(opcion != 4);
        
       }catch(NumberFormatException ex){
           System.out.println("ERROR!!!!");
       }
    }
    
    private static void buscarCasas(Casa[] casas, double precioMaximo){
        //IMPRIMIR CASA POR DEBAJO DEL PRECIO precioMaximo
        System.out.println("Casas por debajo de " + precioMaximo + " euros");
        boolean casasEncontradas = false;
        
        //FORMA 1 de recorrer un array
        for(int i=0; i < casas.length ; i++){
            if(casas[i] != null && casas[i].getPrecioVenta() < precioMaximo){
                casas[i].imprimirDatos();
                casasEncontradas = true;
            }
        }
        
        //FORMA 2 de recorrer un array
//        for (Casa casa : casas) {
//            if(casa != null && casa.getPrecioVenta() < precioMaximo){
//                casa.imprimirDatos();
//                casasEncontradas = true;
//            }
//        }

            if(!casasEncontradas){
                System.out.println("NO SE HA ENCONTRADO NINGUNA CASA");
            }
        
    }
}
