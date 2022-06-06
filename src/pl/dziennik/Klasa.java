package pl.dziennik;

import java.util.ArrayList;
import java.util.List;

public class Klasa {
    private final String nazwaKlasy;
    private List<Uczen> listaUczniowWklasie = new ArrayList<>();

    Klasa(String nazwaKlasy) {
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
