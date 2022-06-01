package pl.dziennik;

import java.util.List;

public class Uczen {
    private String imie;
    private String nazwisko;
    private Klasa ktoraKlasa;
    private List<PrzedmiotSzkolny> listaPzedmiotowUcznia;


    public Uczen(String imie, String nazwisko, Klasa ktoraKlasa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ktoraKlasa = ktoraKlasa;
    }

    public Klasa getKtoraKlasa() {
        return ktoraKlasa;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void addPrzedmiot (PrzedmiotSzkolny przedmiot){
        this.listaPzedmiotowUcznia.add(przedmiot);
    }
}
