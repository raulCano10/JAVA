/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasofechas;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author raul
 */
public class Evento {
    private String descripcion;
    private LocalDateTime fechaHora;
    private Persona organizador;
    private Instant creadoEn;
    
    public Evento(String d, LocalDateTime fechaHora, Persona p){
        this.descripcion = d;
        this.fechaHora = fechaHora;
        this.organizador = p;
        this.creadoEn = Instant.now();
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
    
    public String devolverFechaFormateada(){
        DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return this.fechaHora.format(fomatter);
    }
    
    public void calcularTiempoDesdeCreacion(){
        Instant ahora = Instant.now();
        long segundos = ChronoUnit.SECONDS.between(this.creadoEn, ahora);
        long minutos = ChronoUnit.MINUTES.between(this.creadoEn, ahora);
        System.out.println("El tiempo desde la creacion es de: " + minutos + " minutos y " + segundos+ " segundos" );
    }
    
    public long diasQueHanPasadoHastaOtroEvento(Evento otroEvento){
        return ChronoUnit.DAYS.between(this.fechaHora, otroEvento.getFechaHora());
    }
}
