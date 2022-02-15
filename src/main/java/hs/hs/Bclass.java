package hs.hs;

public class Bclass {
    private final Aclass aClass;

    public Bclass(Aclass aClass) {
        this.aClass = aClass;
    }

    public String getAValue() {
        
        return this.aClass.getNotiA();
    }
    
}




