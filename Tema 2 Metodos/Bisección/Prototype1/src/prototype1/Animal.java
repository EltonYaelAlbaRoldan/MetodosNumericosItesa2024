
package prototype1;
import java.util.Objects;

public abstract class Animal {
    public int patas;
    public boolean omnivoro;
    public boolean mamifero;
    public String color;

    public Animal() {
    }

    public Animal(Animal animal) {
        if (animal != null) {
            this.patas = animal.patas;
            this.omnivoro = animal.omnivoro;
            this.mamifero = animal.mamifero;
            this.color = animal.color;

        }
    }

    public abstract Animal clone();

    @Override
    public boolean equals(Object object2) {
    if (!(object2 instanceof Animal)) return false;
        Animal animal2 = (Animal) object2;
        return animal2.omnivoro == omnivoro && animal2.patas == patas
        && animal2.mamifero == mamifero && Objects.equals(animal2.color, color);
    }
}

