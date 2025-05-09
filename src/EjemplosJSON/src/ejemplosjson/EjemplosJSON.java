/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosjson;

//import org.json.*;
import org.json.JSONArray;
import org.json.JSONObject;


public class EjemplosJSON {

    public static void main(String[] args) {
        /********************************************************************
         * Ejemplo 1: Crear un objeto JSON básico y lo vmaos a imprimir
         ********************************************************************/
        
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", "Juan");
        jsonObject.put("edad", 25);
        jsonObject.put("email", "juan@gmail.com");
        System.out.println("**********IMPRIMIR 1: jsonObject.toString()***********");
        System.out.println(jsonObject.toString());
        
        System.out.println("**********IMPRIMIR 2: jsonObject.toString(1) ***********");
        System.out.println(jsonObject.toString(1));
        System.out.println("");
        System.out.println("");
        /*******************************************************************
         * Ejemplo 2: Crear un array con 2 objetos JSON
         ******************************************************************/
        
        System.out.println("**********Ejemplo 2: Crear un array con 2 objetos JSON ***********");
        JSONObject json1 = new JSONObject();
        JSONObject json2 = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        
        json1.put("nombre", "Juan");
        json1.put("edad", 25);
        json1.put("email", "juan@gmail.com");
        
        jsonArray.put(json1);
        
        System.out.println(jsonArray.toString(1));
        
    }
    
}
