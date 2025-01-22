/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionTama�oArray.Opcion1;

/**
 *
 * @author Ra�l
 */
public class Alumno {
     private int id;
    private String nombre;
    private int edad;
    
    public Alumno(String nombre, int edad){
        this.id=(int)(Math.random()*1000);
        this.nombre=nombre;
        this.edad=edad;
        
    }

    public int getId() {
        return id;
    }

    
    public void imprimirDetalles(){
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        
    }
    
    public String toCadena(){
        
        //return "ID:"+id+"  "+nombre+ .......
        String alumno= String.format("ID:%d  %10s %d",id,nombre,edad);
        return alumno;
    } 
    
}
