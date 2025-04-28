/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poligonos;

/**
 *
 * @author raul
 */
public abstract class  Poligono {
    protected int num_lados;
    
    public Poligono(){
    }
    
    public Poligono(int num_lados) {
        this.num_lados = num_lados;
    }

    public int getNum_lados() {
        return num_lados;
    }

    public void setNum_lados(int num_lados) {
        this.num_lados = num_lados;
    }
    
    public abstract double Area();
    
    @Override
    public String toString(){
        String cadena = String.format("Este poligono tiene lados: %d",this.num_lados);
        return cadena;
    }
    
}
