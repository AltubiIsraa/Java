package hs.hs;

/**
 * Aclass
 */
public class Aclass {
private String notiA;

public Aclass(String notiA) {
    this.notiA = notiA;
}

public String getNotiA(){
    return notiA;

}

// public void setNotiA(String notiA){
//     this.notiA = notiA;
// }

@Override
public String toString(){
    return notiA;
}
}
// Aclass classA = new Aclass("Ola");