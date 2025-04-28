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
public class Banco {
    private String nombre;
    private ArrayList<CuentaCorriente> listaCuentas;
    private ArrayList<Cliente> listaClientes;
    
    public Banco(String nombre){
        this.nombre = nombre;
        this.listaCuentas = new ArrayList<CuentaCorriente>();
        this.listaClientes = new ArrayList<Cliente>();
    }
    
    public void nuevoCliente(String DNI, String nombre, String apellidos, String email){
        Cliente cliente = new Cliente(DNI, nombre, apellidos, email);
        this.listaClientes.add(cliente);
    }
    
   
    
    public CuentaCorriente buscarCuenta(int numero){
        for (CuentaCorriente cuenta : this.listaCuentas) {
            if (cuenta.getNumero() == numero){
                return cuenta;
            }
        }
        return null;
    }
    
    public Cliente buscarCliente(String dni){
        for (Cliente cliente : this.listaClientes) {
            if (cliente.getDNI().equals(dni)) {                             
                return cliente;                
            }
        }
        return null;
    }
    
    public ArrayList<CuentaCorriente> getCuentas(Cliente c){
        ArrayList<CuentaCorriente> nuevaListaCuentas = new ArrayList<CuentaCorriente>();
        for(CuentaCorriente cuenta : listaCuentas){
            if(cuenta.getTitular().getDNI().equals(c.getDNI())){
                nuevaListaCuentas.add(cuenta);
            }
        }
        return nuevaListaCuentas;
    }
    
    public void listarCuentas(){
        for(CuentaCorriente cuenta : listaCuentas){
            System.out.println("Cuentas: " + cuenta.aCadena());
        }
    }
    
    public void listarClientes(){
        for (Cliente cliente : listaClientes) {
            cliente.imprmirDetalles();
        }
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", listaCuentas=" + listaCuentas + ", listaClientes=" + listaClientes + '}';
    }
    
    
}
