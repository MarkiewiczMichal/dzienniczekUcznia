package pl.dziennik;

public class Klasa {
    private final String nazwaKlasy;

    Klasa(String nazwaKlasy){
        this.nazwaKlasy=nazwaKlasy;
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwaKlasy='" + nazwaKlasy + '\'' +
                '}';
    }
}
