package pl.dziennik;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Szkola szkolaPodstawowa = new Szkola();
        Klasa klasa1a = new Klasa("1a");
        Klasa klasa1b = new Klasa("1b");
        Klasa klasa1c = new Klasa("1c");
        Klasa klasa2a = new Klasa("2a");
        Klasa klasa2b = new Klasa("2b");
        Klasa klasa2c = new Klasa("2c");

        szkolaPodstawowa.dodajNowaKlase(klasa1a);
        szkolaPodstawowa.dodajNowaKlase(klasa1b);
        szkolaPodstawowa.dodajNowaKlase(klasa1c);
        szkolaPodstawowa.dodajNowaKlase(klasa2a);
        szkolaPodstawowa.dodajNowaKlase(klasa2b);
        szkolaPodstawowa.dodajNowaKlase(klasa2c);

        Uczen sonia = new Uczen("Sonia", "Nowicka");
        Uczen krzys = new Uczen("Krzysztof", "Krzeminski");
        Uczen wiktoria = new Uczen("Wiktoria", "Kozlowska");
        Uczen kamila = new Uczen("Kamila", "Dąbrowska");
        Uczen maria = new Uczen("Maria", "Mazur");
        Uczen maja = new Uczen("Maja", "Kołodziejczyk");
        Uczen pawel = new Uczen("Paweł", "Michalik");
        Uczen oliwia = new Uczen("Oliwia", "Dąbrowska");
        Uczen bartek = new Uczen("Bartek", "Lewandowski");

        klasa1a.dodajUczniaDoKlasy(sonia);
        klasa1a.dodajUczniaDoKlasy(krzys);
        klasa1a.dodajUczniaDoKlasy(wiktoria);
        klasa1b.dodajUczniaDoKlasy(kamila);
        klasa1b.dodajUczniaDoKlasy(maria);
        klasa1b.dodajUczniaDoKlasy(maja);
        klasa1c.dodajUczniaDoKlasy(pawel);
        klasa1c.dodajUczniaDoKlasy(oliwia);
        klasa1c.dodajUczniaDoKlasy(bartek);

        System.out.println(szkolaPodstawowa.getListaKlaswSzkole());
        System.out.println(klasa1a.getListaUczniowWklasie());

        Ocena sixMark = new Ocena(6,LocalDate.of(2022,6,6));
        Ocena  fiveMark = new Ocena(5,LocalDate.of(2022,6,7));

        sonia.dodajOcene(NazwaPrzedmiotu.MATEMATYKA,sixMark);
        sonia.dodajOcene(NazwaPrzedmiotu.MATEMATYKA,fiveMark);

        System.out.println(sonia.podajOcenyZprzedmiotu(NazwaPrzedmiotu.MATEMATYKA));

        Ocena  oneMark = new Ocena(1,LocalDate.of(2022,12,31));
        sonia.dodajOcene(NazwaPrzedmiotu.FIZYKA,oneMark);

        System.out.println(sonia.podajOcenyZprzedmiotu(NazwaPrzedmiotu.MATEMATYKA));
        System.out.println(sonia.podajOcenyZprzedmiotu(NazwaPrzedmiotu.FIZYKA));

        sonia.dodajOcene(NazwaPrzedmiotu.MATEMATYKA,oneMark);
        System.out.println(sonia.podajOcenyZprzedmiotu(NazwaPrzedmiotu.MATEMATYKA));


        System.out.println("--------------");

        System.out.println(sonia.podajSredniaOcenzPrzedmiotu(NazwaPrzedmiotu.MATEMATYKA));
    }
}
