/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author raul
 */
public class Camion extends Vehiculo {

    private int km_tacografo;

    public Camion(String matri, String mar_modo) {
        super(matri, mar_modo);
        this.km_tacografo = 0;
    }

    public Camion(String matri, String mar_modo, int km_m) {
        super(matri, mar_modo, km_m);
        this.km_tacografo = 0;
    }

    @Override
    public boolean checkAceite() {
        if (this.km_aceite >= 30000) {
            this.km_aceite = 0;
            return true;
        }
        return false;
    }

    @Override
    public boolean checkRuedas() {
        if (this.km_ruedas >= 50000) {
            this.km_ruedas = 0;
            return true;
        }
        return false;
    }

    @Override
    public void avanzar(int km) {
        super.avanzar(km);
        this.km_tacografo += km;

        boolean cambioTacografo = false;
        
        if (checkTacografo()) {
            cambioTacografo = true;
        }
        
        System.out.println("Cambio de tacografo: " + cambioTacografo);

    }

    public boolean checkTacografo() {
        if (this.km_tacografo >= 50000) {
            this.km_tacografo = 0;
            return true;
        }
        return false;
    }
}
