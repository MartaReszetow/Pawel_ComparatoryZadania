import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class OfertaSprzedazy {

    private String nazwaProduktu;
    private int cena;

    @Override
    public String toString() {
        return "{" +
                 nazwaProduktu +
                ", cena=" + cena +
                '}';
    }
}
