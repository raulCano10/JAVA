/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import static java.lang.Thread.sleep;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author Raúl
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        /*
        De forma tradicional, el manejo de fechas se ha hecho con la clase <java.util.Date> y
        <java.util.Calendar>. Estas clase se han visto sustituidas por una nueva API para manejar
        fechas y horas a partir de la versión Java8, que se encuentra en el paquete <java.time>.
        Se puede justificar el uso de esta nueva API por los siguientes motivos:
        ? Es más fácil de usar y de comprender.
        ? Soporta zonas horarias de una forma directa.
        ? Es segura para el manejo de hilos concurrentes. 

        */
        
        //CLASE INSTANT
        //Creamos un instante de tiempo por ejemplo ahora
        Instant intante1 = Instant.now();
        
        //Formato ISO8601. Esto no es manejable debemos formatearlo
        System.out.println("Instante " + intante1);
        
        //Si tomamos dos instante diferentes en el tiempo podemos ver los minutos y segundos que 
        //ha trascurrido entre ellos
/*       
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Fecha.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
        Instant intante2 = Instant.now();
   
        long diferenciaMinutos = ChronoUnit.MINUTES.between(intante1, intante2);
        long diferenciaSegundos = ChronoUnit.SECONDS.between(intante1, intante2);
         System.out.println("diferenciaMinutos " + diferenciaMinutos);
         System.out.println("Han pasado " + diferenciaSegundos + " segundazos");
         
         
         //CLASE LOCADATE
         //Para manejar una fecha local sin tiempo, usamos la clase LocalDate. Si queremos tomar
         //la fecha de hoy, lo haremos de la forma:
         
         LocalDate localDate = LocalDate.now(); //Obtenemos la fecha actual
         
         
         //Vamos a darle formato con la clase DateTimeFormatter
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         String fechaHoy = localDate.format(dtf);
         System.out.println("localDate " + localDate);
         System.out.println("fechaHoy " + fechaHoy);
         
         //Por ejemplo, si quisiéramos imprimir la fecha de la forma ?>01/02/2020<? lo haremos
         //usando el patrón:
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("'-->'dd/MM/yyyy'<--'");
         String fechaHoy2 =  localDate.format(formato);
         System.out.println("fechaHoy " + fechaHoy2);
         
         
         //CLASE LOCALTIME
         //Esta clase maneja una hora local
         LocalTime localTime = LocalTime.now(); //obtiene la hora actual
         //Damo formato a la hora
         DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
         String horaActual = localTime.format(formatoHora);
         System.out.println("localTime " + localTime);
         System.out.println("horaActual " + horaActual);
         
         
         //CLASE LOCALDATATIME
         //Para obtenner tanto la fecha como la hora
         LocalDateTime localDateTime=LocalDateTime.now(); //fecha y hora actual

        //Formateamos la salida y sacamos fecha y hora
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("\nDia y hora: "+localDateTime.format(formatoFechaHora));

        //Usando un LocalDateTime podemos sacar solo la fecha o solo la hora
        DateTimeFormatter formatoSoloFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha solo: "+localDateTime.format(formatoSoloFecha));
         
        
        //Crear fechas concretas
        //1. con LocalDate.parse
        //2. LocalDate.of
        
        DateTimeFormatter formatoFechaConcreta = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Crear una fecha concreta con .parse
        LocalDate fecha1= LocalDate.parse("28/02/2020", formatoFechaConcreta);
        System.out.println("\nFecha1: "+fecha1.format(formatoFechaConcreta));

        //Crear una fecha concreta con .of
        LocalDate fecha2=LocalDate.of(2020, 4, 15);
        System.out.println("Fecha2: "+fecha2.format(dtf));
        
        //Calcular tiepo entre fechas
        //Calculando dias y meses entre fechas usando CHRONOUNIT
        long dias2 = ChronoUnit.DAYS.between(fecha1, fecha2);
        long meses2 = ChronoUnit.MONTHS.between(fecha1, fecha2);
        long años2 = ChronoUnit.YEARS.between(fecha1, fecha2);

        System.out.println("\n<Dias> entre las dos fechas: "+dias2);
        System.out.println("<Meses> entre las dos fechas: "+meses2);
        System.out.println("<Años> entre las dos fechas: "+años2); 
        
        //Obtener el dia de la semana o del mes de una fecha concreta
        Locale locale_es=new Locale("es"); //local de español.
        System.out.println("\nDada la fecha 28/03/2020:");
        System.out.println("----------------------------");
        System.out.println("Dia semana:"+fecha2.getDayOfWeek()); //Devuelve un DayOfWeek

        DayOfWeek diaSemana=fecha2.getDayOfWeek();
        String diaSemanaEspaña=diaSemana.getDisplayName(TextStyle.FULL, locale_es);

        System.out.println("Dia semana en español: "+diaSemanaEspaña);

        System.out.println("Dia: "+fecha2.getDayOfMonth());
        System.out.println("Mes: "+fecha2.getMonth()); //Devuelve un Month

        String mesEspaña=fecha2.getMonth().getDisplayName(TextStyle.FULL, locale_es);
        System.out.println("Mes en español: "+mesEspaña);
        System.out.println("Mes: "+fecha2.getMonthValue());
        System.out.println("Año: "+fecha2.getYear());
        
        
        //Tambien podemos ver los días que tiene un mes, ver si un año concreto es bisiesto o si
        //una fecha es de una año bisiesto, etc.
         //Obtener los dias de un mes
         int dias = YearMonth.of(2020, 2).lengthOfMonth();
         System.out.println("El mes FEBRERO de 2020 tiene <"+dias+"> dias");


         //Ver si es un año bisiesto el año actual
         Year año= Year.now();
         System.out.println("Es el año "+año+" bisiesto? -->"+año.isLeap());

         Year año2=Year.of(2019);
         System.out.println("Es el año "+año2+" bisiesto? -->"+año2.isLeap());
    }
    
}
