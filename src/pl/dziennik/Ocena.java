package pl.dziennik;

import java.time.LocalDate;

public class Ocena {
    private final int ocena;
    public final LocalDate dataOceny;

    Ocena(int ocena, LocalDate dataOceny){
        this.ocena = ocena;
        this.dataOceny=dataOceny;
    }

    public int getOcena() {
        return ocena;
    }

    public LocalDate getDate(){
        return dataOceny;
    }

    @Override
    public String toString() {
        return "Ocena{" +
                "ocena=" + ocena +
                ", dataOceny=" + dataOceny +
                '}';
    }
}
