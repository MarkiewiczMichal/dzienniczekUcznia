package pl.dziennik;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private final String nazwaKlasy;
    private List<Uczen> listaUczniowWklasie = new ArrayList<>();

    SchoolClass(String nazwaKlasy) {
        this.nazwaKlasy = nazwaKlasy;
    }

    public void dodajUczniaDoKlasy(Uczen uczen) {
        listaUczniowWklasie.add(uczen);
    }

    public List<Uczen> getListaUczniowWklasie() {
        return listaUczniowWklasie;
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwaKlasy='" + nazwaKlasy + '\'' +
                '}';
    }
}
