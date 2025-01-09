/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Libro {
    
    //Validar que es LDDD 
    
    
    private String isbn; 
    private String titulo;
    private String autor;
    private int año;
    
    public Libro(String isbn, String titulo, String autor, int año){
        //Antes de asignar this.isbn = isbn
        //Tenemos que validar que isbn es una Letra seguida de 3 Digitos
        //Esto se puede ahcer ocn expresiones regulares
        //Usaremos //Character.isletter();//Character.isDigit();
        if(validarISBN(isbn)){
             this.isbn = isbn;
        }else{
            System.out.println("EL ISBN DEL LIBRO " +titulo+ " NO ES CORRECTO");
            System.out.println("El Libro se ha creado SIN ISBN...");
        }
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }
     
    public Libro(String titulo, String autor, int año){
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public String getIsbn() {                     
        
        //EN IF evalua primero si isbn es nulo o no
        //y una vez que ha comprado que NO es nulo enotonces evalua si esta vacio
            if(this.isbn == null || this.isbn.isEmpty()){
                return "El libro no tiene ISBN!!!";
            }else{
                return this.isbn;
            }           
        
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void citaBibliografica(){
        System.out.println("ISBN: " + this.isbn +
                "TITULO: " + this.titulo +
                "AUTOR: " + this.autor +
                "AÑO: " + this.año);
    }
    
    private boolean validarISBN(String isbn){
        
        //Validar que isbn sea de longitud 4 "LDDD"
        if(isbn.length() != 4){
            System.out.println("ERROR Libro.validarISBN().- Longitud incorrecta...");
            return false;
        }
        
        //Validar que la primer caracter es una letra "L" 
       
        if(!Character.isLetter(isbn.charAt(0))){
            System.out.println("ERROR Libro.validarISBN().- El primera caracter no es una letra...");
            return false;
        } 
        
        //Validar que el segundo, tercero, y cuarto caracter son Digitos "DDD"
         /*
        if(!Character.isDigit(isbn.charAt(1))){
            System.out.println("ERROR Libro.validarISBN().- El segundo caracter no es un digito...");
            return false;
        } 
        if(!Character.isDigit(isbn.charAt(2))){
            System.out.println("ERROR Libro.validarISBN().- El tercer caracter no es un digito...");
            return false;
        } 
        if(!Character.isDigit(isbn.charAt(3))){
            System.out.println("ERROR Libro.validarISBN().- El cuarto caracter no es un digito...");
            return false;
        } 
        */
                for(int i = 1; i < 4; i++){
                    if(!Character.isDigit(isbn.charAt(i))){
                    System.out.println("ERROR Libro.validarISBN().- El " + i + " caracter no es un digito...");
                    return false;
                } 
            }
        
        
        return true;
    }
    
    
}
