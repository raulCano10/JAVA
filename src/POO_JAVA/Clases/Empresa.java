/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Empresa {

    private String cif;
    private String nombre;
    private String localidad;

    public Empresa(String cif, String nombre, String localidad) {
        this.cif = cif;
        this.nombre = nombre;
        this.localidad = localidad;
    }

    public String getCif() {
        return this.cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void imprimir() {
        System.out.println("CIF: \u001b[31m" + this.cif + "\u001b[0m");
        System.out.println("Nombre: \u001b[34m" + this.nombre + "\u001b[0m");
        System.out.println("Localidad: \u001b[34m" + localidad + "\u001b[0m");
    }

}
