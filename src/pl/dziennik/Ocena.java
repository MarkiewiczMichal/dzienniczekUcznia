package pl.dziennik;

import java.time.LocalDate;

public class Ocena {
    private final int ocena;
    private final LocalDate dataOceny;

    Ocena(int ocena, LocalDate dataOceny){
        this.ocena = ocena;
        this.dataOceny=dataOceny;
    }
}
