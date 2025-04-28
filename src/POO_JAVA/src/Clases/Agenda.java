/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;
import java.util.Scanner;

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
    
    public void modificarContacto(int id){
        //Buscar el contacto POR ID en la lista de contactos y llamar a la funcion modificarcontacto(ContactoComp contacto)
        // para que esta la edite     
        boolean contactoEncontrado = false;
        for(ContactoComp contacto : this.listaContactos){
            if(contacto.getId() == id){
                modificarContacto(contacto);
                contactoEncontrado = true;
            }
        }        
        if(!contactoEncontrado){
            System.out.println("NO HE ENCONTRADO NINGUN CONTACTO CON ID = : " + id);
        }
    }

    public boolean modificarContacto(String nombre){
        //Buscar el contacto POR NOMBRE en la lista de contactos y llamar a la funcion modificarcontacto(ContactoComp contacto)
        // para que esta la edite
         boolean contactoEncontrado = false;
        for(ContactoComp contacto : this.listaContactos){
            if(contacto.getNombre().equalsIgnoreCase(nombre)){
                modificarContacto(contacto);
                contactoEncontrado = true;
            }
        }
        if(!contactoEncontrado){
            System.out.println("NO HE ENCONTRADO NINGUN CONTACTO CON NOMBRE = : " + nombre);
        }
        return contactoEncontrado;
    }

    private void modificarContacto(ContactoComp c){
        System.out.println("¿Que campo quieres modificar?");
        System.out.println("1. Modificar NOMBRE.");
        System.out.println("2. Modificar EMAIL.");
        System.out.println("3. Modificar TELEFONO.");
        System.out.println("4. Salir.");
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do{
            opcion = Integer.parseInt(sc.nextLine());
           //opcion = sc.nextInt();
           //sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.print("Introduce nuevo Nombre:");
                    String nombre = sc.nextLine();
                    c.setNombre(nombre);
                    break;
                case 2:
                    System.out.print("Introduce nuevo Email:");
                    String email = sc.nextLine();
                    c.setEmail(email);
                    break;
                case 3:
                    System.out.print("Introduce nuevo Telefono:");
                    String telefono = sc.nextLine();
                    c.setTelefono(telefono);
                    break;
                case 4:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Seleccione otra opcion");
            }
        
        }while(opcion > 4);
        
    }
    
    public ArrayList<ContactoComp> buscarContactos(String expresion){
        ArrayList<ContactoComp> listaNuevaConLaBusqueda = new ArrayList();
        System.out.println(expresion);
        
        for (ContactoComp contacto : this.listaContactos){
            
            System.out.println(contacto.getNombre());
            if (contacto.getNombre().startsWith(expresion)){
                
                listaNuevaConLaBusqueda.add(contacto);
            }
            
        }
        
        return listaNuevaConLaBusqueda;
    }
}
