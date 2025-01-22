/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionTamañoArray.Opcion2;

/**
 *
 * @author Raúl
 */
public class Grupo {
      private String nombre;
    private Alumno[] lista;
    
    public Grupo(String nombre){
        this.nombre=nombre;
        lista=new Alumno[30];
        
    }
   
    public void addAlumno(Alumno a){
        //Voy a buscar el primer hueco
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==null){
                lista[i]=a;
                break;  
            }
        }
       
    }
    
    public Alumno buscarAlumno(int id){
        Alumno alu=null;
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==null){
                break;
            }
            else if (lista[i].getId()==id){
               return lista[i]; 
            } 
        }
        return alu;
        
    }
    
    public void listarGrupo(){
        System.out.println("Grupo:  "+this.nombre);
        System.out.println("=========================");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==null){
                break;
            }
            else{
                System.out.println(lista[i].toCadena());  
            } 
            
        }
    }
  
    
    
    //OPCION USANDO UN METODO QUE ME DEVUELVE EL TAM EFECTVO DEL ARRAY
    
    public void listarGrupo2(){
        System.out.println("Grupo:  "+this.nombre);
        System.out.println("=========================");
        
        for (int i = 0; i < this.totalAlumnos(); i++) {
                System.out.println(lista[i].toCadena());  
        }    
        
    }
    
    
    private int totalAlumnos(){
        int total=0;
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==null)
                break;
            else
                total++;
            
        }
        return total;
        
        
        
    }
}
