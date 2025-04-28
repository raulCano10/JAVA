/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.Empresa;
import Clases.BD_Empresa;
import java.util.ArrayList;

public class mainEmpresa {

    public static void main(String[] args) {
        BD_Empresa baseDatos = new BD_Empresa();
        Empresa empresa1 = new Empresa("B12345678", "Nike Inc.", "Oregon(USA)");
        baseDatos.addEmpresa(empresa1);
        Empresa empresa2 = new Empresa("B00044562", "Apple Inc.", "California(USA)");
        baseDatos.addEmpresa(empresa2);
        Empresa empresa3 = new Empresa("B11111111", "Nitro S.L.", "Murcia(SPA)");
        baseDatos.addEmpresa(empresa3);

        empresa1.imprimir();
        Empresa empresaEncontrada = baseDatos.buscarCIF("B00044562");
        if(empresaEncontrada==null){
            System.out.println("No se ha encontrado la empresa con el CIF B00044562");
        }else{
            System.out.println("Se va a imprimir la empresa con el CIF B00044562");
            empresaEncontrada.imprimir();
            
        }
        System.out.println("");
        
        ArrayList<Empresa> empresaEncontradaNombre = baseDatos.buscarNombre("in");
        
        if(empresaEncontradaNombre == null){
        
            System.out.println("No se han encontrado empresas con ese nombre");

        }else{
            for(Empresa empresa : empresaEncontradaNombre){
                
                empresa.imprimir();
            }
        }
    
        
}

}
