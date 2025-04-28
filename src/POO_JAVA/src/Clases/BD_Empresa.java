/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import java.util.ArrayList;

public class BD_Empresa {

    private ArrayList<Empresa> listaEmpresas;

    public BD_Empresa() {
        this.listaEmpresas = new ArrayList<>();
    }

    public ArrayList<Empresa> getBd() {
        return listaEmpresas;
    }

    public void setBd(ArrayList<Empresa> bd) {
        this.listaEmpresas = bd;
    }

    public void addEmpresa(Empresa e) {
        listaEmpresas.add(e);
    }

    public Empresa buscarCIF(String Cif) {
        for (Empresa empresa : listaEmpresas) {
            if (empresa.getCif().equalsIgnoreCase(Cif)) {
                return empresa;
            }
        }
        return null;
    }

    public ArrayList<Empresa> buscarNombre(String Nombre) {
        ArrayList<Empresa> empresasEncontradas = new ArrayList();
        for (Empresa empresa : listaEmpresas) {

            if (empresa.getNombre().toLowerCase().startsWith(Nombre.toLowerCase())) {
                empresasEncontradas.add(empresa);
            }
        }
        return empresasEncontradas;
    }

}
