/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploconexionbd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploConexionBD {

  
    public static void main(String[] args) {
        /**************************
        * 1. CARGAMOS EL DRIVER
        **************************/
        try {          
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver com.mysql.cj.jdbc.Driver cargado correctamente.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error, no se ha podido cargar el driver ");
        }
        
        /*************************************
         * 2. Creamos la conexion con la BD
         *************************************/
        String url = "jdbc:mysql://localhost/tienda";
        String user = "root";
        String password = "";
        Connection miConexion = null;
        try{
             miConexion = DriverManager.getConnection(url, user, password);
             System.out.println("Conexion realizada correctamente a la BD tienda");

             /**************************************
            * 3. Ejecutar una consulta a la BD
            *************************************/

           Statement stmt = miConexion.createStatement();
           
           /*****************
            * SELECT 
            **************/
           /*
           Resulset 
           - Dipone de un cursor para desplazarse por la consulta
           - Dispone de metodos para acceder al valor de cada campo
           - Es un objeto de SOLO LECTURA y de SOLO AVANCE. Se recorre de atras hacia delante.
           - El metodo next() nos permite desplazarnos.
           - next() devuelve true si encuentra algun valor y devuelve false si NO lo encuentra.
           
           */
           //ResultSet rs = stmt.executeQuery("SELECT * FROM producto WHERE codigo = 7 OR codigo = 10");
           ResultSet rs = stmt.executeQuery("SELECT * FROM producto");
           
           while(rs.next()){
               int codigo = rs.getInt("codigo");
               String nombre = rs.getString("nombre");
               System.out.println("Codigo: " + codigo + " | Nombre: " + nombre);
           }
        
//           ResultSet rs = stmt.executeQuery("SELECT * FROM producto");
//           while(rs.next()){
//               int codigo = rs.getInt("codigo");
//               if(codigo == 7 || codigo == 10){
//                   String nombre = rs.getString("nombre");
//                   System.out.println("Codigo: " + codigo + " | Nombre: " + nombre);
//               }
//               
//               
//           }
           
//          ResultSet rs1 = stmt.executeQuery("SELECT * FROM alumno");
//           while(rs1.next()){
//               Date fechaNcimiento = rs1.getDate("fecha_nacimiento");
//               System.out.println("Fechas de nacimiento " + fechaNcimiento);
//           }
//           
          
           /*****
            * INSERT EN BD
            * 
            */
           String nombre = "Disco duro SATA260 100TB";
           double precio = 600.55;
           int codigo_frabricante = 5;
           String consulta = "INSERT INTO producto VALUES (null,'"+nombre+"',"+precio+","+codigo_frabricante+")";
           //String consulta = "INSERT INTO producto (nombre,precio,codigo_fabricante) VALUES ('"+nombre+"',"+precio+","+codigo_frabricante+")";
           
            System.out.println(consulta);
           
           //int result = stmt.executeUpdate(consulta);
           
            /*****
            * UPDATE EN BD
            * 
            */
            String actualizarRegistro = "UPDATE producto SET nombre = 'Disco duro SATA300 100TB Editado' WHERE codigo = 1";
            int result = stmt.executeUpdate(actualizarRegistro);
            
            
            /*****
            * DELETE EN BD
            * 
            */
            String borrarRegistro1 = "DELETE FROM producto WHERE codigo = 1";
            int result1 = stmt.executeUpdate(borrarRegistro1);
            
            
            /****************************************
             * CONSULTAS PREPARADAS
             ***************************************/
            String nombre2 = "SATA5000";
            int codigo = 3;
            String sql = "SELECT * FROM producto WHERE nombre = '"+nombre2+"'"; 
            
            String sql2 = "SELECT * FROM producto WHERE nombre = ? OR codigo = ?";
            PreparedStatement preparadaStmt = miConexion.prepareStatement(sql2);
            preparadaStmt.setString(1, nombre2);
            preparadaStmt.setInt(2, codigo);
            ResultSet rs4 = preparadaStmt.executeQuery();
            //SELECT * FROM producto WHERE nombre = 'SATA5000' OR codigo = 3
            preparadaStmt.setString(1, "SATA8000");
            //SELECT * FROM producto WHERE nombre = 'SATA8000' OR codigo = 3
            preparadaStmt.setInt(2, 45);
            ResultSet rs5 = preparadaStmt.executeQuery();
            
            preparadaStmt.setString(1, "SATA9000");
            preparadaStmt.setInt(2, 67);
            ResultSet rs6 = preparadaStmt.executeQuery();
            
            
            String insert = "INSERT INTO producto VALUES (null,?,?,?)";
            PreparedStatement insertPreparada = miConexion.prepareStatement(insert);
           
            insertPreparada.setString(1, "SATA232323");
            insertPreparada.setDouble(2, 233.24);
            insertPreparada.setInt(3, 4);
            insertPreparada.executeUpdate();
                    
            
            /***************************
             * DESCONEXION DE LA BASE DE DATOS
             ***************************/
            rs.close();
            stmt.close();
            
            
        }catch(SQLException ex){
            System.out.println("Error al crear la conexion");
        }catch(Exception ex){
            System.out.println("Error al crear la conexion");
        }finally{
            if(miConexion != null){
                try {
                    miConexion.close();
                } catch (SQLException ex) {
                    System.out.println("Error al cerrar la conexion");
                }
            }
            
        }
        
        
    }
    
}
