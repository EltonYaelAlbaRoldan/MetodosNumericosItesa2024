
package prototype1;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Gato gato = new Gato();
        gato.patas = 4;
        gato.mamifero = true;
        gato.omnivoro = true;
        gato.color = "black";
        gato.flexibilidad = true;
        animals.add(gato);

        Gato otroGato = (Gato) gato.clone();
        animals.add(otroGato);

        Loro loro = new Loro();
        loro.frase = "Hola amigos";
        loro.color = "yellow";
        loro.patas = 2;
        loro.mamifero = false;
        loro.omnivoro = true;
        animals.add(loro);

        Loro otroLoro = (Loro) loro.clone();
        animals.add(otroLoro);

        System.out.println("Los gatos son iguales? " + animals.get(0).equals(animals.get(1)));
        System.out.println("Los loros son iguales? " +animals.get(2).equals(animals.get(3)));
    }
}