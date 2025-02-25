/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class Equipo {

    private int id;
    private String nombre;
    private ArrayList<Jugador> plantilla;
    private int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.plantilla = new ArrayList<Jugador>();
        this.puntos = 0;
    }

    public void fichar(Jugador jugador) {
        //Si esta fichado --> No lo ficho imprimo "Ya está fichado"
        if (jugador.isFichado()) {
            System.out.println("Ya está fichado");
        } else {
            if (this.plantilla.size() < Campeonato.getMaxPlantilla()) {
                this.plantilla.add(jugador);
                jugador.setFichado(true);
                System.out.println("Jugador fichado.");
            } else {
                System.out.println("Plantilla completa.");
            }
        }
        //comprobar si hemos superado el numero maximo de la plantilla

        //si no esta fichado lo añado a la plantilla.
    }

    public void añadirVictoria() {
        this.puntos += 3;
    }

    public void añadirDerrota() {
        this.puntos += 0;
    }

    public void añadirEmpate() {
        this.puntos += 1;
        //this.puntos++;
        //this.puntos = this.puntos + 1;
    }

    public void imprimirPlantilla() {
        System.out.println("Equipo:" + this.nombre);
        for (Jugador jugador : plantilla) {
            System.out.println(jugador.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    
}
