/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

import java.util.ArrayList;

public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            ArrayList<Animal> granjaAnimales = new ArrayList<>();
            granjaAnimales.add(new Animal("Zipi"));//Se agrega sin necesidad de declarar una variable
            granjaAnimales.add(new Perro("Tobi"));
            granjaAnimales.add(new Animal("Zape"));
            granjaAnimales.add(new Gato("Michu"));

            for (int i = 0; i < granjaAnimales.size(); i++) {
                Animal animal_item = granjaAnimales.get(i);

                System.out.println(animal_item);
                animal_item.comer();
                if (animal_item instanceof Perro) {
                    Gato unPerro = (Gato) animal_item;
                    //unPerro.ladrar();
                    //Definiendo variable
                }
                if (animal_item instanceof Gato) {
                    ((Gato) animal_item).maullar();
                    //Sin definir variable
                }
            }
        }catch (Exception e){
            System.out.println("Error " + e.getMessage());
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
    }

}
