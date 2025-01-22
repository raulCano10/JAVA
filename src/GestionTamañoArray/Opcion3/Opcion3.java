/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionTamañoArray.Opcion3;

import java.util.Scanner;

/**
 *
 * @author Raúl
 */
public class Opcion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        //Alumno alu;
        
        Grupo claseDAW1=new Grupo("DAW1");
        
        claseDAW1.addAlumno(new Alumno("Mortadelo",20));
        claseDAW1.addAlumno(new Alumno("Filemon",18));
        claseDAW1.addAlumno(new Alumno("Carpanta",30));
        
        claseDAW1.listarGrupo();
        
        System.out.println("");
        System.out.print("Introduce ID:");
        int id=Integer.parseInt(teclado.nextLine());
        
        Alumno alu=claseDAW1.buscarAlumno(id);
        
        if (alu==null){
            System.out.println("Alumno no encontrado");
        }
        else{
            alu.imprimirDetalles();
        }
       
              
    }
    
}
