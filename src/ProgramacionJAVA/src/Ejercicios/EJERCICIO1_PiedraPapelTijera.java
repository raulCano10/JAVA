/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class EJERCICIO1_PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        //Contadores de victorias y empates
        int victoriasUsuario = 0;
        int victoriasComputadora = 0;
        int empate = 0;
        int numeroAleatorioMaquina = 0;
        
        //Mostrar titulo variable formateado
        String titulo = "ESTE ES MI JUEGO DEL PIEDRA - PAPEL - TIJERA";
        String titulo1 = "PIEDRA - PAPEL - TIJERA";
        String titulo2 = "PI - PA - TI";
        formatearTitulo(titulo);
        
        String eleccionUsuario;
        do{
            System.out.println("Introduce Piedra, papel o tijera");
            eleccionUsuario = sc.nextLine().toLowerCase();                       
            
            if(!eleccionUsuario.equals("piedra") 
                    && !eleccionUsuario.equals("Papel")
                    && !eleccionUsuario.equals("tijera")){
                System.out.println("No has elegido piedra, papel o tijara. Vuelve a intentarlo");
                continue;
            }
            
            //comprobar si el usuario no quiere jugar mas
            if(eleccionUsuario.equals("No quiero jugar")){
                System.out.println("FIN DEL JUEGO!!");
                break;
            }
            
            //Genera la eleccion de la maquina de forma aleatoria
            numeroAleatorioMaquina =  random.nextInt(3) + 1;
            String eleccionMaquina = null;
            
            switch(numeroAleatorioMaquina){
                case 1:
                    eleccionMaquina = "piedra";
                    break;
                case 2:
                    eleccionMaquina = "papel";
                    break;
                case 3:
                    eleccionMaquina = "tijera";
                    break;
                default:
                    System.out.println("Cuidado que la eleccion de la maquina no esta entre 1 y 3");
                    break;
            }
            
            //Comparar elecciones de usuario y maquina
            //Vamos a ver quien a ganado o si hay empate
            if(eleccionUsuario.equals(eleccionMaquina)){
                System.out.println("Es un Empate");
                empate++;
            }else if( //Yo gano
                    eleccionUsuario.equals("piedra") && eleccionMaquina.equals("tijera")
                    ||
                    eleccionUsuario.equals("tijera") && eleccionMaquina.equals("papel")
                    ||
                    eleccionUsuario.equals("papel") && eleccionMaquina.equals("piedra")
                    ){
                System.out.println("HAS GANADO ESTA RONDA!!!");
                victoriasUsuario++;
            }else{
                System.out.println("HA GANADO LA COMPUTADORA!!!");
                victoriasComputadora++;
            }
            
            //
            /*
                if(eleccionUsuario.equals("piedra") 
                        || eleccionUsuario.equals("Papel")
                        || eleccionUsuario.equals("tijera")){

                    //continua el ejercicio

                }else{
                    System.out.println("No has elegido piedra, papel o tijara. Vuelve a intentarlo");

                }
            */
            
            
        }while(!eleccionUsuario.equals("no quiero jugar"));
        
        
        mostrarEstadisticas(victoriasUsuario, victoriasComputadora, empate);
    }
    
    public static void formatearTitulo(String mi_titulo){
        //Pinto la primera linea
        int longitud = mi_titulo.length() + 4;
        String linea = "";
        
        for(int i = 0; i < longitud; i++){
            linea = linea + "*";
        }
        //pinto la linea 1
        System.out.println(linea);
        //pinto la segunda 2
        System.out.println("* " + mi_titulo + " *");
        //pinto la linea 3
        System.out.println(linea);       
    }

    public static void mostrarEstadisticas(int victoriasUsuario, int victoriasComputadora, int empate) {
        System.out.println("ESTADISTICAS DEL JUEGO");
        System.out.println("victoriasUsuario: " + victoriasUsuario);
        System.out.println("victoriasComputadora: " + victoriasComputadora);
        System.out.println("Empate:" + empate);
    }
}
