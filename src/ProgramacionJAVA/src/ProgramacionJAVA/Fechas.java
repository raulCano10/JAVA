/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



package ProgramacionJAVA;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //java.util.Date;
        //java.util.Calendar;
        
        //import java.time
        // Es mas facil de utilizar y comprender.
        // Soporta zonas horarias de forma directa.
        // Segura para el manejo de hilos concurrentes.
        
        //CLASE INSTANT
        //Creamos un instante de tiempo    
        Instant ahora = Instant.now();
        System.out.println("Intante ahora: " + ahora);
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            
        }
        
        Instant dentroDe5segundos = Instant.now();
        
        //Calcular la diferencia entre dos instantes
        //Diferencia en minutos
        long diferenciaMinutos = ChronoUnit.MINUTES.between(ahora, dentroDe5segundos);
        long diferenciaSegundos = ChronoUnit.SECONDS.between(ahora, dentroDe5segundos);
        System.out.println("Diferencia en MINUTOS: " + diferenciaMinutos);
        System.out.println("Diferencia en SEGUNDOS: " + diferenciaSegundos);
        
        //CLASE LOCALDATE
        //Clase para manejar fechas sin tiempo
        
        LocalDate fechaHoy = LocalDate.now(); //obtenemos la fecha actual
        System.out.println("fechHoy: " + fechaHoy);
        
        //Vamos a darle formato a la fecha anterior con la clase:
        //CLASE DATE_TIME_FORMATTER
        
        DateTimeFormatter miFormatoNuevo = DateTimeFormatter.ofPattern("dd/MM/yyyy");       
        String fechaFormateada = fechaHoy.format(miFormatoNuevo);
        System.out.println("fechaHoyFormateada: " + fechaFormateada);
        
        DateTimeFormatter otroFormatoDistinto = DateTimeFormatter.ofPattern("-------dd/MM/yyyy------");
        String fechaFormatada2 = fechaHoy.format(otroFormatoDistinto);
        System.out.println("fechaFormatada2: " + fechaFormatada2);
        
        //CLASE LOCALTIME
        //clase para manejar la hora
        LocalTime horaActual = LocalTime.now();
        System.out.println("horaActual: " + horaActual);
        
        DateTimeFormatter miformatoDeHora = DateTimeFormatter.ofPattern("HH:mm");
        String horaActualFormateada = horaActual.format(miformatoDeHora);
        System.out.println("horaActualFormateada: " + horaActualFormateada);
        
        //CLASE LOCALDATETIME
        LocalDateTime mifechaHora = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + mifechaHora);
        
        DateTimeFormatter miformatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String fechaHOraFormateada = mifechaHora.format(miformatoFechaHora);
        System.out.println("Fecha y hora formateada: " + fechaHOraFormateada);
        
        //Crear fechas concretas
        //FORMA 1: LocalDate.parse       
        DateTimeFormatter miFormatoConcreto = DateTimeFormatter.ofPattern("dd/MM/yyyy");    
        
        LocalDate mifechaConcreta = LocalDate.parse("03/01/2019", miFormatoConcreto);    
        String fechaFormateada1 = mifechaConcreta.format(miFormatoConcreto);
        System.out.println("Fecha concreta del 2020: " + fechaFormateada1);
        
        //FORMA 2: LocaDate.of
        LocalDate fecha2 = LocalDate.of(2025, 12, 25);
        String miFechaFormateada2 = fecha2.format(miFormatoConcreto);
        System.out.println("Fecha formateada concreta con OF: "+ miFechaFormateada2);
        
        //ChronoUnit
        //Tiempo entre fechas
        long dias = ChronoUnit.DAYS.between(mifechaConcreta, fecha2);
        long meses = ChronoUnit.MONTHS.between(mifechaConcreta, fecha2);
        long anios = ChronoUnit.YEARS.between(mifechaConcreta, fecha2);
        
        System.out.println("Dias que han pasado entre las fechas: " + dias);
        System.out.println("Meses que han pasado entre las fechas: " + meses);
        System.out.println("Años que han pasado entre las fechas: " + anios);
        
        //fecha2.getDayOfWeek();
        //fecha2.getDayOfMonth();
        //fecha2.getDayOfYear();
        
        System.out.println("Dia de la semana: " + fecha2.getDayOfWeek());
        System.out.println("Dia del Mes: " + fecha2.getDayOfMonth());
        System.out.println("Dia del Año: " + fecha2.getDayOfYear());
        
        //Para pasar a idioma ES
        Locale locale_es = new Locale("es");        
        String diaSemanaEspaña = fecha2.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, locale_es);      
        System.out.println("Dia de la semana en español: " + diaSemanaEspaña);
        
    }
    
}
