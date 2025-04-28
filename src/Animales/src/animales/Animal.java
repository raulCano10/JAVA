
package animales;

/**
 *
 * @author raul
 */
public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void comer(){
        System.out.println("   Estoy comiendo");
    }
    @Override
    public String toString(){
        return String.format("\nMe llamo %s", this.nombre);
    }
    
    
}
