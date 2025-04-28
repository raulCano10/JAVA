/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.Banco;
import Clases.Cliente;
import Clases.CuentaCorriente;

/**
 *
 * @author raul
 */
public class mainBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Crear el BANCO
        Banco miBanco = new Banco("BANCO RAUL");
        
        //2.Crear 2 clientes
        //Crear un cliente
        Cliente miPrimerCliente = new Cliente("485125684H", "Raul", "Cano", "raul.cano@aaa.com");
        
        Cliente segundoCliente = new Cliente();
        segundoCliente.setDNI("485125684H");
        segundoCliente.setNombre("Raul");
        segundoCliente.setApellidos("Cano");
        segundoCliente.setEmail("raul@aaa.com");
        
        Cliente tercerCliente = new Cliente("485125684H", "Sergio", "Fernandez", "se.cano@aaa.com");
        
        //3. Abrir 2 cuentas . Una para cada cliente     
        //Numero = 1001
        //contadorCuentas = 1001
        //CuentaCorriente cuentaA = new CuentaCorriente(miPrimerCliente, 1000);
        
        //Numero = 1002
        //contadorCuentas = 1002
        //CuentaCorriente cuentaB = new CuentaCorriente(segundoCliente, 500);
        
//        miBanco.abrirCuenta(miPrimerCliente, 1000);
//        miBanco.abrirCuenta(segundoCliente, 500);
        
        //Numero = 1003s
        //contadorCuentas = 1003
        //CuentaCorriente terceraCuentaCuenta = new CuentaCorriente(tercerCliente, 10);
        
        //4. Listar clientes
        miBanco.listarClientes();
        
        //5. Listar Cuentas
        miBanco.listarCuentas();
        
        
        //Transferencia entre cuentas
        CuentaCorriente cuentaA = miBanco.buscarCuenta(1001);
        CuentaCorriente cuentaB = miBanco.buscarCuenta(1002);
        
        if(cuentaA != null && cuentaB != null){
            cuentaA.transferencia(cuentaB, 15);
        }else{
            System.out.println("OJO QUE ALGUNA DE LAS CUENTAS 1001 o 1002 no existe!!!!");
        }
        
        
        
        
        
    }
    
    
    
    
}
