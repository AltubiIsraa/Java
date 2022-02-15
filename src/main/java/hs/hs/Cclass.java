package hs.hs;

public class Cclass {
    private final Bclass bClass;

    public Cclass(Bclass bClass) {
        this.bClass = bClass;
    }

    public String getCValue() {
        return this.bClass.getAValue();
    }
}
