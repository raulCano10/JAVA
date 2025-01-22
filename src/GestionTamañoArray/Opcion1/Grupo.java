/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionTamañoArray.Opcion1;

/**
 *
 * @author Raúl
 */
public class Grupo {
    private String nombre;
    private Alumno[] lista;
    
    private int contador=0; //atributo para contar
                                 //los alumnos totales
    
    public Grupo(String nombre){
        this.nombre=nombre;
        lista=new Alumno[30];
        contador=0;
    }
   
    public void addAlumno(Alumno a){
       if (contador<30){
            lista[contador]=a;
            contador++;
       }     
       else{
            System.out.println("Total alumos completado");
       }     
    }
    
    
    public Alumno buscarAlumno(int id){
        Alumno alu=null;
        
        for (int i = 0; i < this.contador; i++) {
            if (lista[i].getId()==id){
               return lista[i]; 
            } 
        }
        return alu;
        
    }
    
    public void listarGrupo(){
        System.out.println("Grupo:  "+this.nombre);
        System.out.println("=========================");
        for (int i = 0; i < contador; i++) {
            System.out.println(lista[i].toCadena());
        }
    }
  
}
