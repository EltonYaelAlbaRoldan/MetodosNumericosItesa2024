
package prototype1;

public class Gato extends Animal{

    public Boolean flexibilidad;

    public Gato() {
    }

    public Gato(Gato Gato) {
        super(Gato);
        if (Gato != null) {
            this.flexibilidad = Gato.flexibilidad;
        }
    }

    @Override
    public Animal clone() {
        return new Gato(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Gato) || !super.equals(object2)) return false;
        Gato Animal2 = (Gato) object2;
        return Animal2.flexibilidad == flexibilidad;
    }
}
