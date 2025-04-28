
package ejerciciosdepuracion;

public class Main {
    public static void main(String[] args) {
        
        int resultado = sumaCondicional(5, 5);
        
    }

    public static int sumaCondicional(int a, int b) {
        int suma = a + b;
        if (a == b) {
            suma *= 2; 
        }
        return suma;
    }

    /*
    1. Usa watch para ver el valor de 'suma' cuando a = 5, b = 5.
    2. ¿La expresión 'a == b' se evalúa a true o false?
    3. ¿Como cambia el valor si a != b?

    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int multiplicarYReducir(int a, int b) {
        int producto = a * b;
        return producto % 10;
    }

    public static boolean contieneVocal(String texto) {
        return texto.contains("a") || texto.contains("e");
    }

    public static double dividir(int a, int b) {
        return a / b;
    }

    public static boolean esNegativo(int n) {
        return !(n >= 0);
    }

    public static boolean sonIguales(String s1, String s2) {
        return s1 == s2;
    }

    public static int contarPares(int[] nums) {
        int contador = 0;
        for (int n : nums) {
            if (n % 2 == 0) contador++;
        }
        return contador;
    }

    public static boolean invertir(boolean valor) {
        valor = !valor;
        return valor;
    }

    public static String unir(String a, String b) {
        return a + b + a;
    }

    public static int confuso(int x) {
        if (x < 10) return x * 2;
        return x - 5;
    }

    public static int sumaHasta(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static boolean esVerdaderoFalso(boolean a, boolean b) {
        return a && !a;
    }

    public static String recortar(String s) {
        return s.substring(1, s.length() - 1);
    }

    public static boolean sonSimilares(String a, String b) {
        return a.toLowerCase().equals(b.toLowerCase());
    }

    public static void imprimirHasta(int n) {
        for (int i = 0; i == n; i++) {
            System.out.println(i);
        }
    }
}
