package pl.dziennik;

import java.util.List;

public class PrzedmiotSzkolny {
    private final String nazwaPrzedmiotu;
    private List<Ocena> listaOcen;

    PrzedmiotSzkolny(String nazwaPrzedmiotu){
        this.nazwaPrzedmiotu=nazwaPrzedmiotu;
    }

    public void setListaOcen(Ocena ocena) {
        this.listaOcen.add(ocena);
    }
}
