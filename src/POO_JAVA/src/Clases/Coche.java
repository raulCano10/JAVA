/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Coche {
    public String marca;
    private final int numRuedas;
    private String modelo;
    private String propiedad;
    private String propiedad2;
    private String propiedad3;
    private String propiedad4;
    private String propiedad5;
    private String propiedad6;
    private String propiedad7;
    private String propiedad8;
    private String propiedad9;
    private static double descuento;
    //public String numeroBastidor;
    
    //El constructor se llama igual que la clase
    //public Coche(){
    //    
    //}
    
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.numRuedas = 4;
    }
    
     public Coche(String marca){
        this.marca = marca;
        this.numRuedas = 4;

    }
     
    public Coche(String marca, int numRuedas){
        this.marca = marca;
        this.numRuedas = numRuedas;
    }
    
    public Coche(String marca,String modelo, int numRuedas){
        this.marca = marca;
        this.modelo = modelo;
        this.numRuedas = numRuedas;
    }

    public static double getDescuento() {
        return Coche.descuento;
    }

    public static void setDescuento(double descuento) {
        Coche.descuento = descuento;
    }   
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public void pintaInfo(){
        System.out.println("El coche de la marca " + this.marca + 
                " y modelo " + this.modelo);
    }

    public String getPropiedad() {
        return this.propiedad;
    }

    public String getPropiedad2() {
        return this.propiedad2;
    }

    public String getPropiedad3() {
        return this.propiedad3;
    }

    public String getPropiedad4() {
        return this.propiedad4;
    }

    public String getPropiedad5() {
        return this.propiedad5;
    }

    public String getPropiedad6() {
        return this.propiedad6;
    }

    public String getPropiedad7() {
        return this.propiedad7;
    }

    public String getPropiedad8() {
        return this.propiedad8;
    }

    public String getPropiedad9() {
        return this.propiedad9;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public void setPropiedad2(String propiedad2) {
        this.propiedad2 = propiedad2;
    }

    public void setPropiedad3(String propiedad3) {
        this.propiedad3 = propiedad3;
    }

    public void setPropiedad4(String propiedad4) {
        this.propiedad4 = propiedad4;
    }

    public void setPropiedad5(String propiedad5) {
        this.propiedad5 = propiedad5;
    }

    public void setPropiedad6(String propiedad6) {
        this.propiedad6 = propiedad6;
    }

    public void setPropiedad7(String propiedad7) {
        this.propiedad7 = propiedad7;
    }

    public void setPropiedad8(String propiedad8) {
        this.propiedad8 = propiedad8;
    }

    public void setPropiedad9(String propiedad9) {
        this.propiedad9 = propiedad9;
    }

    public int getNumRuedas() {
        return numRuedas;
    }
    
    
}
