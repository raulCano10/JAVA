/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasofechas;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author raul
 */
public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    
    public Persona(String nombre, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    
    
    public long calcularEdad(){
        long edad = ChronoUnit.YEARS.between(this.fechaNacimiento, LocalDate.now());
        return edad;
    }
    
    //Obtiene el dia de la semana de la fecha de nacimiento de la persona
    public String getDiaSemana(){
        Locale locale_es = new Locale("es");
        return "" + this.fechaNacimiento.getDayOfWeek().getDisplayName(TextStyle.FULL, locale_es);
        
    }
}
