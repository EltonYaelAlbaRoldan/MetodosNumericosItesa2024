
package prototype1;

public class Loro extends Animal{

    public String frase;

    public Loro() {
    }

    public Loro(Loro loro) {
        super(loro);
        if (loro!= null) {
            this.frase = loro.frase;
        }
    }

    @Override
    public Animal clone() {
        return new Loro(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Loro) || !super.equals(object2)) return false;
        Loro shape2 = (Loro) object2;
        return shape2.frase == frase;
    }
}