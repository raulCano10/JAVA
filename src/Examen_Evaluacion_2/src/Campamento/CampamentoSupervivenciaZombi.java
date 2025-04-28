/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Campamento;

import Campamento.Constantes.Habilidad;
import java.time.LocalDate;
import java.util.Scanner;


public class CampamentoSupervivenciaZombi {

    public static void main(String[] args) {
        
        Campamento campamento = new Campamento("Refugio DAW");
        int opcion = -1;
        Scanner sc = new Scanner(System.in);
        
        do{
            
            System.out.println("\033[33m=== Menu de Gestion del Campamento ===\033[0m"); //Amarillo
            System.out.println("1. Incluir Zona");
            System.out.println("2. Incluir Superviviente");
            System.out.println("3. Formar Expedicion");
            System.out.println("4. Incluir Superviviente a la expedicion");
            System.out.println("5. Mostrar estado completo");
            System.out.println("0. Salir");
            
            System.out.println("\033[34mElige una opcion:\033[0m");
            
//            opcion = sc.nextInt(); // 3\n
//            sc.nextLine();
            
            opcion = Integer.parseInt(sc.nextLine());
            
            switch(opcion){
                case 1:
                    //TODO: Añadir zona al campamento
                    // llamar a la funcion añadirZona de la clase Campamento
                    System.out.print("Nombre de la zona:");
                    String zona = sc.nextLine();
                    campamento.añadirZona(zona);
                    break;
                case 2:                        
                     //TODO: Añadir superviviente
                    System.out.print("Nombre:");
                    String nombre = sc.nextLine();
                    System.out.print("Edad:");
                    int edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Selecciona la habilidad:");
                    
                    int cont = 1;
                    for(Habilidad h : Habilidad.values()){
                        System.out.println(cont++ + "- " + h);
                    }
                    
                     int habilidad = 0;
                     Habilidad habilidadAuxiliar = null;
                     
                    do{
                        System.out.println("Introduce la habilidad elegida:");
                        habilidad = Integer.parseInt(sc.nextLine());
                    
                        
                        switch(habilidad){
                            case 1:
                                habilidadAuxiliar = Habilidad.MEDICO;
                                break;
                            case 2:
                                habilidadAuxiliar = Habilidad.EXPLORADOR;
                                break;
                            case 3:
                                habilidadAuxiliar = Habilidad.COCINERO;
                                break;
                            case 4:
                                habilidadAuxiliar = Habilidad.GUARDIA;
                                break;
                            case 5:
                                habilidadAuxiliar = Habilidad.MECANICO;
                                break;
                            case 6:
                                habilidadAuxiliar = Habilidad.AGRICULTOR;
                                break;
                            default:
                                System.out.println("No ha seleccionado una hibilidad correcta");
                                break;
                        }
                    }while(habilidad < 1 || habilidad > 6);
                    
                    Superviviente s = new Superviviente(nombre, edad, habilidadAuxiliar);
                    
                    System.out.println("Introduce el numero de objectos de que lleva");
                    int numObjetos = Integer.parseInt(sc.nextLine());
                    for(int i = 0; i < numObjetos ; i++){
                        System.out.print("Objeto numero " + (i+1) + ":");
                        String objeto = sc.nextLine();
                        s.añadirObjeto(objeto);
                    }
                    
                    campamento.añadirSuperviviente(s);
                    
                    break;
                case 3:
                    //TODO: Formar Expedicion
                    System.out.print("Destino de la expedicion:");
                    String destino = sc.nextLine();
                    System.out.println("Fecha inicio (aaaa-mm-dd)");
                    LocalDate fechaInicio = LocalDate.parse(sc.nextLine());
                    System.out.println("Fecha fin (aaaa-mm-dd)");
                    LocalDate fechaFin = LocalDate.parse(sc.nextLine());
                    campamento.formarExpedicion(destino, fechaInicio, fechaFin);
                    break;
                case 4:
                     //TODO: Incluir Superviviente a la expedicion
                    System.out.print("Introduce el ID de la expedicion:");
                    int idExpedicion = Integer.parseInt(sc.nextLine());
                    
                    //Buscar la expedicion
                    EquipoExpedicion expedicionSeleccionada = null;
                    for(EquipoExpedicion e : campamento.getExpediciones()){
                        if(e.getIdExpedicion() == idExpedicion){
                            expedicionSeleccionada = e;
                            break;
                        }
                    }
                    
                    
                    if(expedicionSeleccionada == null){
                        System.out.println("\033[31mNo se encontró una expedición con el id " + idExpedicion + "\033[0m");
                    }else{
                        Superviviente supervivienteSeleccionado = null;
                        System.out.print("Introduce el nombre del superviviente:");
                        String nombreSup = sc.nextLine();
                        //Buscar la expedicion                     
                        for(Superviviente superviviente : campamento.getSupervivientes()){
                            if(superviviente.getNombre().equalsIgnoreCase(nombreSup)){
                                supervivienteSeleccionado = superviviente;
                                break;
                            }
                        }
                        
                        if(supervivienteSeleccionado == null){
                            System.out.println("\033[31mNo se encontró un superviviente con ese Nombre: " + nombreSup + "\033[0m");                                         
                        }else{
                             //Si hay superviviente y por supuesto hay tambien equipoExpedicion
                             boolean bienAñadido = expedicionSeleccionada.añadirSuperviviente(supervivienteSeleccionado);
                             
                             if(bienAñadido){
                                 System.out.println("\033[32mSuperviviente incluido correctamente a la expedicion\033[0m");                                         
                             }else{
                                 System.out.println("\033[31mLa expedicion ya tiene un maximo de 5 supervivientes\033[0m");                                         
                             }
                             
                        }
                    }
                    
                    
                    
                    break;
                case 5:
                    //TODO: Mostrar Estado completo
                    //VER IMAGEN DE LA PAGINA 5
                    break;
                case 0:
                    System.out.println("Saliendo del menu...");
                    break;
                default:
                    System.out.println("Opcion no valida...");
                    break;
            }
            
        }while(opcion != 0);
        
    }
    
}
