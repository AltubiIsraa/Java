package hs.hs;

public class Cclass {
    private final Aclass bClass;

    public Cclass(Aclass bClass) {
        this.bClass = bClass;
    }

    public String getCValue() {
        return this.bClass.getNotiA();
    }
}
