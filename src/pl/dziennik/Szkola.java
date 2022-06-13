package pl.dziennik;

import java.util.ArrayList;
import java.util.List;

public class Szkola {
    private List<SchoolClass> listaklas = new ArrayList<>();


    public void dodajNowaKlase(SchoolClass name) {
        listaklas.add(name);
    }

    public List<SchoolClass> getListaKlaswSzkole() {
        return listaklas;
    }
}
