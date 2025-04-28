/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebadebugger;

/**
 *
 * @author raul
 */
public class PruebaDebugger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 double[] notas = {8.5, 7.0, 9.2, 4.0, 6.5, 10.0, 5.5, 0.0};
 System.out.println("Media: " + calcularMedia(notas));
 System.out.println("Nota ma?xima: " + calcularMaximo(notas));
 System.out.println("Nota m??nima: " + calcularMinimo(notas));
 System.out.println("Desviacio? n t??pica: " + calcularDesviacion(notas));
 }
 public static double calcularMedia(double[] notas) {
 double suma = 0;
 for (double nota : notas) {
 suma += nota;
 }
 return suma / notas.length;
 }
 public static double calcularMaximo(double[] notas) {
 double max = 0;
 for (double nota : notas) {
 if (nota > max) {
 max = nota;
 }
 }
 return max;
 }
 public static double calcularMinimo(double[] notas) {
 double min = 0;
 for (double nota : notas) {
 if (nota < min) {
 min = nota;
 }
 }
 return min;
 }
 public static double calcularDesviacion(double[] notas) {
 double media = calcularMedia(notas);
 double suma = 0;
 for (int i = 0; i < notas.length; i++) {
 double diferencia = notas[i] - media;
 suma += diferencia * diferencia;
 }
 double max = 0;
 return Math.sqrt(suma / max);
 }

    }
    

