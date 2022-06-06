package pl.dziennik;

import java.util.ArrayList;
import java.util.List;

public class Szkola {
    private List<Klasa> listaklas = new ArrayList<>();


    public void dodajNowaKlase(Klasa name) {
        listaklas.add(name);
    }

    public List<Klasa> getListaKlaswSzkole() {
        return listaklas;
    }
}
