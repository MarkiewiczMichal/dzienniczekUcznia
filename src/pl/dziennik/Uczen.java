package pl.dziennik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Uczen {
    private String imie;
    private String nazwisko;
    private Map<NazwaPrzedmiotu, List<Ocena>> listaOcen = new HashMap<>();


    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void dodajOcene(NazwaPrzedmiotu nazwaPrzedmiotu, Ocena ocena) {
        List<Ocena> poszczegolneOcenyzPrzedmiotu = new ArrayList<>();

        if (listaOcen.get(nazwaPrzedmiotu) != null) {
            poszczegolneOcenyzPrzedmiotu.addAll(listaOcen.get(nazwaPrzedmiotu));
        }
        poszczegolneOcenyzPrzedmiotu.add(ocena);
        listaOcen.put(nazwaPrzedmiotu, poszczegolneOcenyzPrzedmiotu);

    }

    public List<Ocena> podajOcenyZprzedmiotu(NazwaPrzedmiotu nazwaPrzedmiotu) {
        return listaOcen.get(nazwaPrzedmiotu);
    }

    public float podajSredniaOcenzPrzedmiotu (NazwaPrzedmiotu nazwaPrzedmiotu){
        float srednia = 0;
        int liczbaOcen=0;
        for ( Map.Entry<NazwaPrzedmiotu,List<Ocena>> oceny: listaOcen.entrySet()) {
            System.out.println(oceny.getKey());
            for ( Ocena poszczegolneOceny: oceny.getValue()) {
                if (oceny.getKey() == nazwaPrzedmiotu){
                    srednia += poszczegolneOceny.getOcena();
                    liczbaOcen++;
                }

            }
        }
        return srednia/liczbaOcen;
    }


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
