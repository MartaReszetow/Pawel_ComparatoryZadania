package zad2OfertaSprzedazy;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class OfertaSprzedazy {

    private String nazwaProduktu;
    private Double cena;

    @Override
    public String toString() {
        return "{" +
                 nazwaProduktu +
                ", cena=" + cena +
                '}';
    }
}
