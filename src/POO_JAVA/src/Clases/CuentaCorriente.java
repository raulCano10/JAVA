/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class CuentaCorriente {
    private static int contadorCuentas = 1001;
    private int numero;
    private Cliente titular;
    private double saldo;
    
    public CuentaCorriente(Cliente c, double saldoInicial){
        this.titular = c;
        this.saldo = saldoInicial;
        this.numero = contadorCuentas++;
    }

    public void ingreso(double cantidad){
        if(cantidad > 0){
             this.saldo = this.saldo + cantidad;
        }else{
            System.out.println("NO SE PUEDE INGRESAR LA CANTIDAD");
        }
    }
    
    public boolean reintegro(double cantidad){
        if(this.saldo > 0 && this.saldo > cantidad && cantidad > 0){
            this.saldo = this.saldo - cantidad;
            return true;
        }else{
            System.out.println("No es posible sacar dinero. No tienes saldo suficiente");
            return false;
        }         
    }
    
    public boolean transferencia(CuentaCorriente ccDestino, double cantidad){
       boolean haSalidoBienElReintegro = reintegro(cantidad); //Aqui le estoy quitando a CUENTA A             
       
       if(haSalidoBienElReintegro){
         ccDestino.ingreso(cantidad); //Ingros cantidad en CUENTA B  
          return true;
       }else{
           System.out.println("No se ha realizado el reintegro correctamente");
           return false;
       }      
       
    }
    
    public String aCadena(){
//        String cadena = "" + this.numero + this.titular + this.saldo;
//        return cadena;
        return " - " + this.numero + " - " + this.titular.aCadena() + " - " + this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public static int getContadorCuentas() {
        return contadorCuentas;
    }

    public static void setContadorCuentas(int contadorCuentas) {
        CuentaCorriente.contadorCuentas = contadorCuentas;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
