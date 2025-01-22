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
public class Agenda {
    private ArrayList<ContactoComp> listaContactos;
    private int contadorID;
    
    public Agenda(){
        this.listaContactos = new ArrayList();
    }

    public ArrayList<ContactoComp> getListaContactos() {
        return this.listaContactos;
    }

    public void setListaContactos(ArrayList<ContactoComp> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public int getContadorID() {
        return this.contadorID;
    }

    public void setContadorID(int contadorID) {
        this.contadorID = contadorID;
    }
    
    public void addContacto(String nombre, String email, String telefono){
        //Sumo 1 al contado
        this.contadorID++;
        //Creo el contacto con los parametros que me llegan (nombre, email, telefono)
        ContactoComp contacto = new ContactoComp(this.contadorID, nombre, email, telefono);
        //añado el contacto a lista
        this.listaContactos.add(contacto);
    }
    
    //LISTAR CONTACTOS DE LA AGENDA
    public void listarAgenda(){
        for (ContactoComp contacto : this.listaContactos) {
            System.out.println(contacto.aCadena());
        }
    }
    
}
