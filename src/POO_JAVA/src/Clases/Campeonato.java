/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Campeonato {
    private String nombre;
    private int totalEquipos;
    private static int maxPlantilla = 2;

    public Campeonato(String nombre){
        this.nombre = nombre;
        this.totalEquipos = 3;       
    }
    
    public boolean altaJugador(String nombre, int dorsal){
        //TODO: Dar de alta al jugador ¿DONDE?
        //Crear el jugador si no existe y añadirlo a la lista de jugador
        //No se puede repetir dorsal
        
        for(Jugador jugador : BD_Campeonato.obtenerJugadores()){
            if(jugador.getDorsal() == dorsal){
                //System.out.println("EL JUGADOR YA EXISTE");
                return false;
            }
        }       
        //Si no hemos encontrado el dorsal en la lista de jugadores lo vamos a añadir
        //Antes crearemos el jugar y despues lo añadiremos a la lista de jugadores
        Jugador nuevoJugador = new Jugador(nombre, dorsal);
        BD_Campeonato.addJugador(nuevoJugador);            
        return true;
    }
    
    public boolean altaEquipo(String nombre){
        for(Equipo equipo : BD_Campeonato.obtenerEquipos()){
            if(equipo.getNombre().equalsIgnoreCase(nombre)){
                //System.out.println("EL EQUIPO YA EXISTE");
                return false;
            }
        }       
        Equipo nuevoEquipo = new Equipo(nombre);
        BD_Campeonato.addEquipo(nuevoEquipo);            
        return true;
    }
    
    public void jugarCampeonato(){
        for(Equipo equipoLocal : BD_Campeonato.obtenerEquipos()){
            //1ª vez EN ESTE PUNTO equipo = A
            //2ª vez tendremos el equipo = B
            //3ª vez tendremos equipo = C
            for(Equipo equipoVisitante : BD_Campeonato.obtenerEquipos()){             
                //1ª tendre Equipo = A
                if(equipoLocal.getNombre().equalsIgnoreCase(equipoVisitante.getNombre())){
                    //NO JUGAMOS EL PARTIDO SALTAMOS AL SIGUIENTE VALOR DEL FOR
                }else{
                    //SI JUGAMOS EL PARTIDO PORQUE SON DISTINTOS
                    Partido partido = new Partido(equipoLocal,equipoVisitante);
                    BD_Campeonato.addPartido(partido);
                }
            }
                    
        }
        mostrarClasificacion();
    }
    
    private void mostrarClasificacion(){
        for(Equipo equipo : BD_Campeonato.obtenerEquipos()){
            System.out.println(equipo.getNombre() + " PUNTOS: " + equipo.getPuntos());
        }
    }
    
    public static int getMaxPlantilla(){
        return Campeonato.maxPlantilla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalEquipos() {
        return totalEquipos;
    }

    public void setTotalEquipos(int totalEquipos) {
        this.totalEquipos = totalEquipos;
    }
    
    
}
