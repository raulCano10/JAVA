/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionTamañoArray.Opcion4;

import java.util.ArrayList;

/**
 *
 * @author Raúl
 */
public class Grupo {
    private String nombre;
    private ArrayList<Alumno> lista;
    private final int MAX_ALUMNOS = 30;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.lista = new ArrayList<>();
    }

    public int getNumeroAlumnos() {
        return lista.size();
    }

    public void addAlumno(Alumno a) {
        if (lista.size() < MAX_ALUMNOS) {
            lista.add(a);
        } else {
            System.out.println("No puedo añadir más alumnos.");
        }
    }

    public void addAlumnoEnPosicion(int posicion, Alumno a) {
        if (lista.size() < MAX_ALUMNOS && posicion >= 0 && posicion <= lista.size()) {
            lista.add(posicion, a);
        } else {
            System.out.println("No se pudo añadir el alumno en la posición especificada.");
        }
    }

    public Alumno getAlumnoEnPosicion(int posicion) {
        if (posicion >= 0 && posicion < lista.size()) {
            return lista.get(posicion);
        } else {
            System.out.println("Posición no válida.");
            return null;
        }
    }

    public Alumno eliminarAlumnoEnPosicion(int posicion) {
        if (posicion >= 0 && posicion < lista.size()) {
            return lista.remove(posicion);
        } else {
            System.out.println("Posición no válida.");
            return null;
        }
    }

    public boolean eliminarAlumno(Alumno a) {
        return lista.remove(a);
    }

    public void vaciarGrupo() {
        lista.clear();
    }

    public void reemplazarAlumnoEnPosicion(int posicion, Alumno a) {
        if (posicion >= 0 && posicion < lista.size()) {
            lista.set(posicion, a);
        } else {
            System.out.println("Posición no válida.");
        }
    }

    public boolean contieneAlumno(Alumno a) {
        return lista.contains(a);
    }

    public int obtenerIndiceDeAlumno(Alumno a) {
        return lista.indexOf(a);
    }

    public void listarGrupo() {
        System.out.println("Grupo: " + nombre);
        System.out.println("=========================");
        for (Alumno alu : lista) {
            System.out.println(alu.toCadena());
        }
    }
}
