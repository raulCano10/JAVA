package ejercicio06;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author raul
 */
public class BD_Empresa {

    private static ArrayList<Vehiculo> listaVehiculos = new ArrayList();
    private static ArrayList<Alquiler> listaAlquileres = new ArrayList();

    public static void añadirVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
    }

    public static void añadirAlquiler(Alquiler alquiler) {
        
        listaAlquileres.add(alquiler);
    }

    public static void listarFlota() {
        //TODO
    }

    public static Vehiculo obtenerVehiculo(String matricula) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                return v;
            }
        }
        return null;
    }

    public static Alquiler obtenerUltimoAlquiler(String matricula) {
        for (int i = listaAlquileres.size() - 1; i >= 0; i--) {
            Alquiler alqui = listaAlquileres.get(i);
            if (alqui.getVehiculo().getMatricula().equalsIgnoreCase(matricula)) {
                return alqui;
            }
        }
        return null;
    }

    public static void imprimirHistoricoAlquileres() {
        for (Alquiler a : listaAlquileres) {
            a.imprimir();
            System.out.println("");
        }
    }

    public static ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
    
    

}
