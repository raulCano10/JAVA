
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
    /*
        4. Evalúa 'producto % 10' y verifica su valor en watch.
    */


    public static boolean contieneVocal(String texto) {
        return texto.contains("a") || texto.contains("e");
    }
    
    /*
        5. Observa si 'texto.contains("a")' se evalúa a true o false con "Hola".
        6. ¿Qué valor tiene 'texto.contains("A")' si lo pruebas con "Ana"?
    */

    public static double dividir(int a, int b) {
        return a / b;
    }
    /*
        7. Coloca breakpoint en la línea de división con b = 0. ¿Qué error aparece al ejecutar?
        8. Observa el tipo de excepción. ¿Qué clase la lanza? Añade un try y catch para capturar la excepcion

    */
    

    public static boolean esNegativo(int n) {
        return !(n >= 0);
    }
    /*
        9. Evalua la expresion !(n >= 0) para n = -5 en el watch
        10. ¿Que valor devuelve la funcion cuando n = 0? 
    */
    public static boolean sonIguales(String s1, String s2) {
        return s1 == s2;
    }
     /*
        11. Crea s1 = "hola" y s2 = new String("Hola"). ¿El watch de 's1 == s2' es true o false?
        12. ¿Que operador se debería utilizar para que sean iguales?
    */
    public static int contarPares(int[] nums) {
        int contador = 0;
        for (int n : nums) {
            if (n % 2 == 0) contador++;
        }
        return contador;
    }
    /*
        13. ¿Que valor tiene contador al llegar n = 4?
        14. Evalua en watch 'n % 2 == 0' para cada elemento.
    */
    
    
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
