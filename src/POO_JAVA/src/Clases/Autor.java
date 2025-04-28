
package Clases;


public class Autor {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;

    public Autor(String nombre, String apellido1, String apellido2, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getNombrecita(){
        char letraNombre = this.nombre.charAt(0);
        char letraApellido2 = this.apellido2.charAt(0);
        String nombreCompleto = this.apellido1+" "+letraNombre + "." +letraApellido2;
        return nombreCompleto;
    }
    
}
