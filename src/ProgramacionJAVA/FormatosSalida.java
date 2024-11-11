/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

/**
 *
 * @author raul
 */
public class FormatosSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Printf()
        
        //Formateo de numero float con dos decimales
        System.out.printf("Numero formateado: %.2f \n", 12.3622);
        
        //Formatear un numero entero (Caracter d)
        int x = 10;
        System.out.printf("%d \n", x);
        
        //Formatea numero float
        double y = 10.345;
        System.out.printf("%f \n", y);
        
        x = 10;
        //Formateo Entero con signo
        System.out.printf("%+d \n", x);
        
        //Formateo Entero con signo
        int b = -34;
        System.out.printf("%+d \n", b);
        
        //Para mostrar varias variables pondremos varios porcentajes
        double n = 1.025036;
        x = 10;
        System.out.printf("n = %.2f x = %d \n", n, x);
        
        //Podemos indicar en el formato a que variables queremos que corresponda cada %
        // 1$, 2$, 3$, 4$
        System.out.printf("n = %2$.2f x = %1$d \n" , x, n);
        
        //Permite mostrar valores con un ancho de campo determinado
        // En este caso 10
        System.out.printf("n = %20.4f \n", n);
        
        //Rellenar con ceros a la izq
        System.out.printf("n = %020.4f \n", n);
        
        //Alinear a la Izquierda con signo -
        int num = 2;
        System.out.printf("Numero alineado a la izq%+10d \n",num);
        
        //Cadenas minuscula y mayuscula
        String cadena = "Buenos dias como estas hoy \n";
        System.out.printf("%s \n", cadena);
        System.out.printf("%S \n", cadena);
        
        //2. DecimalFormat()             
        //3. String.Format()
    }
    
}
