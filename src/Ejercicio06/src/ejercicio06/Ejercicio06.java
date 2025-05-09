package ejercicio06;


import ejercicio06.BD_Empresa;
import java.time.LocalDate;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author raul
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
   
        
        Vehiculo turismo = new Turismo("1111TTT","Volvo XC60", 0);
        Vehiculo turismo2 = new Turismo("2222TTT", "Audi A4", 0);
        
        Vehiculo furgoneta = new Furgoneta("2222FFF", "Citröen C16", 0);
        
        BD_Empresa.añadirVehiculo(turismo);
        BD_Empresa.añadirVehiculo(turismo2);
        BD_Empresa.añadirVehiculo(furgoneta);
        
        Alquiler newAlquiler = new Alquiler(turismo);
        
        do {
            System.out.println("ALQUILER");
            System.out.println("********************");
            System.out.println("1. Añadir vehiculo");
            System.out.println("2. Historico alquileres");
            System.out.println("3. Alquilar vehiculo");
            System.out.println("4. Devolver vehiculo");
            System.out.println("5. Salir del sistema");
            System.out.print("Elige una opcion: ");
            
            int opcion = sc.nextInt();
            System.out.println("");
            sc.nextLine();
            
            
            switch(opcion) {
                case 1:
                    boolean opcion2 = false;
                    String tipo_vehiculo;
                        do{
                            System.out.print("¿Turismo o furgoneta?: ");
                            tipo_vehiculo = sc.nextLine();
                            if(!tipo_vehiculo.equalsIgnoreCase("turismo") && !tipo_vehiculo.equalsIgnoreCase("furgoneta")){
                                System.out.println("ERROR. Porfavor introduce un vehiculo correcto.");
                                opcion2 = true;
                            } else
                                opcion2 = false;
                        }while(opcion2);
                    
                       
                        
                        
                        System.out.print("Introduce la matricula: ");
                        String matricula = sc.nextLine();

                        System.out.print("Introduce la marca y el modelo: ");
                        String marca_modelo = sc.nextLine();

                        System.out.print("Introduce el kilometraje: ");
//                        int km = sc.nextInt();
                        int km = Integer.parseInt(sc.nextLine());

//                        sc.nextLine();

                        if(tipo_vehiculo.equalsIgnoreCase("turismo")){
                            Vehiculo nuevoVehiculo = new Turismo(matricula, marca_modelo, km);
                            BD_Empresa.añadirVehiculo(nuevoVehiculo);
                        }else if(tipo_vehiculo.equalsIgnoreCase("furgoneta")){
                            Vehiculo nuevoVehiculo = new Furgoneta(matricula, marca_modelo, km);
                            BD_Empresa.añadirVehiculo(nuevoVehiculo);
                        }else {
                            
                            System.out.println("Introduce una opción correcta.");
                        }
                    
                        
                        
                    
                    
                    break;   
                case 2: 
                    BD_Empresa.imprimirHistoricoAlquileres();
                    break;
                case 3:
                    System.out.println("Dime la matricula del coche para alquilar.");
                    String matri = sc.nextLine();
                    
                    Vehiculo v1 = BD_Empresa.obtenerVehiculo(matri);
                    if(v1==null){
                        System.out.println("La matricula indicada no existe.");
                    }else{
                        if(v1.isAlquilado()){
                            System.out.println("El vehiculo ya a sido alquilado.");
                        }else{
                            System.out.println("Dime la fecha de alquiler: ");
                            LocalDate fecha_inicio = LocalDate.parse(sc.nextLine());
                            
                            System.out.println("Dime los kilometros: ");
                            int kilometros = Integer.parseInt(sc.nextLine());
                            
                            Alquiler a1 = null;
                            if(v1 instanceof Turismo){
                                Turismo t1 =(Turismo) v1;
                                t1.alquilar(fecha_inicio, kilometros);
                                a1= new Alquiler(t1);
                            }
                            if(v1 instanceof Furgoneta){
                                Furgoneta f1 = (Furgoneta) v1;
                                f1.alquilar(fecha_inicio, kilometros);
                                a1= new Alquiler(f1);
                            }
                            
                            BD_Empresa.añadirAlquiler(a1);
                    }
                        
                    }
                    
                    break;
                case 4: 
                    System.out.println("Dime el vehiculo a devolver");
                    String matricula1 = sc.nextLine();
                    Vehiculo v2 = BD_Empresa.obtenerVehiculo(matricula1);
                    if(v2==null){
                        System.out.println("La matricula indicada no existe.");
                    }else{
                        System.out.println("Dime la fecha de alquiler");
                        LocalDate fecha_alqui = LocalDate.parse(sc.nextLine());
                        if(v2.isAlquilado()){
                            System.out.println("La fecha de alquiler es de:" + fecha_alqui);
                            
                            System.out.println("Dime los kilometros: ");
                            int kilometros = Integer.parseInt(sc.nextLine());
                            
                            if (v2 instanceof Turismo) {
                                Turismo t2 = (Turismo) v2;
                                t2.devolver(fecha_alqui, kilometros);
                                
                            }
                            if (v2 instanceof Furgoneta) {
                                Furgoneta f2 = (Furgoneta) v2;
                                f2.devolver(fecha_alqui, kilometros);
                                
                            }
                        }
                    }
                    break;
                case 5: 
                    break;
                default: 
                    System.out.println("Error, selecciona una opcion correcta.");
                    break;
            }
            
            
        } while (true);
        
    }
    
}
