package pl.dziennik;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Szkola szkolaPodstawowa = new Szkola();
        SchoolClass klasa1a = new SchoolClass("1a");
        SchoolClass klasa1b = new SchoolClass("1b");
        SchoolClass klasa1c = new SchoolClass("1c");
        SchoolClass klasa2a = new SchoolClass("2a");
        SchoolClass klasa2b = new SchoolClass("2b");
        SchoolClass klasa2c = new SchoolClass("2c");

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

        Ocena sixMark = new Ocena(6,LocalDate.of(2022,6,9));
        Ocena  fiveMark = new Ocena(5,LocalDate.of(2022,6,9));

        sonia.dodajOcene(NazwaPrzedmiotu.MATEMATYKA,sixMark);
        sonia.dodajOcene(NazwaPrzedmiotu.MATEMATYKA,fiveMark);

        System.out.println("sonia ma dwie oceny z matmy 5 i 6");
        System.out.println(sonia.podajOcenyZprzedmiotu(NazwaPrzedmiotu.MATEMATYKA));

        Ocena  oneMark = new Ocena(1,LocalDate.of(2020,11,9));
        sonia.dodajOcene(NazwaPrzedmiotu.FIZYKA,oneMark);

        System.out.println("sonia nadal ma dwie oceny z matmy 5 i 6");
        System.out.println(sonia.podajOcenyZprzedmiotu(NazwaPrzedmiotu.MATEMATYKA));
        System.out.println("sonia ma jedynke z fizyki");
        System.out.println(sonia.podajOcenyZprzedmiotu(NazwaPrzedmiotu.FIZYKA));

        sonia.dodajOcene(NazwaPrzedmiotu.MATEMATYKA,oneMark);

        System.out.println("sonia nadal ma trzy  oceny z matmy 5 i 6 i 1");
        System.out.println(sonia.podajOcenyZprzedmiotu(NazwaPrzedmiotu.MATEMATYKA));


        System.out.println("--------------");

        System.out.println(sonia.podajSredniaOcenzPrzedmiotu(NazwaPrzedmiotu.MATEMATYKA));

        sonia.podajOcenyZokresuCzasowego(NazwaPrzedmiotu.MATEMATYKA,LocalDate.of(2020,1,1),LocalDate.of(2021,1,1));

    }
}
