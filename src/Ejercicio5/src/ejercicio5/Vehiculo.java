/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author raul
 */
public abstract class Vehiculo {

    private String matricula;
    private String marca_modelo;
    protected int km_motor;
    protected int km_aceite;
    protected int km_ruedas;

    public Vehiculo(String matri, String mar_modo) {
        this.matricula = matri;
        this.marca_modelo = mar_modo;
        this.km_motor = 0;
        this.km_aceite = 0;
        this.km_ruedas = 0;
    }

    public Vehiculo(String matri, String mar_modo, int km_m) {
        this(matri, mar_modo);
        this.km_motor = km_m;

    }

    public void avanzar(int km) {
        if (km >= 0) {
            this.km_motor += km;
            this.km_ruedas += km;
            this.km_aceite += km;
            System.out.println("Has recorrido " + km + " kilometros.");
        } else {
            System.out.println("Error: No puedes recorrer una distancia negativa.");
        }
         
        boolean cambioAceite = false;
        boolean cambioRuedas = false;

        if (checkAceite()) {
            cambioAceite = true;
        }
        if (checkRuedas()) {
            cambioRuedas = true;
        }

        System.out.println("Cambio de aceite: " + cambioAceite);
        System.out.println("Cambio de ruedas: " + cambioRuedas);
    }

    @Override
    public String toString() {
        if (this.km_motor == 0) {
            return String.format("%s - %s - nuevo", this.marca_modelo, this.matricula);
        } else {
            return String.format("%s - %s - %skm", this.marca_modelo, this.matricula, this.km_motor);

        }
    }

    public abstract boolean checkAceite();

    public abstract boolean checkRuedas();
}
