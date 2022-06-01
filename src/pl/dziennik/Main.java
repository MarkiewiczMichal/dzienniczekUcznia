package pl.dziennik;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("dupa");
        Klasa pierwszaC = new Klasa("1c");
        PrzedmiotSzkolny matma = new PrzedmiotSzkolny("matematyka");
        Ocena celujacy = new Ocena(6, LocalDate.now());
        matma.setListaOcen(celujacy);
        Uczen marek = new Uczen("Marek","Narkowski",pierwszaC);
        Uczen michal = new Uczen("michal", "markowicz", new Klasa("2d"));
        michal.addPrzedmiot(matma);

        System.out.println(marek.getKtoraKlasa());
        System.out.println(marek.getImie());
        System.out.println(marek.getNazwisko());
        System.out.println(marek.getClass());

    }
}
