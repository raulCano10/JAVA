/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class Alumno extends Persona{
    private String curso;
    private ArrayList<String> mi_array = new ArrayList<>();

//    public Alumno(){
//        System.out.println("SE ESTA EJECUTANDO CONTRUCTOR ALUMNO");
//    }
    
    public Alumno(String curso, String nif){  
        super(nif);
        this.curso = curso;
        mi_array.add("Hola");
        System.out.println("SE ESTA EJECUTANDO CONTRUCTOR ALUMNO");
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
//    public void imprimirDatos(){
//        String nif1 = this.nif;
//    }
    
}
