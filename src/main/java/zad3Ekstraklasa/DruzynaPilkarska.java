package zad3Ekstraklasa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DruzynaPilkarska {
    private String nazwaDruzyny;
    private Double pozycjaWRankingu;
    private Double silaDruzyny;

    @Override
    public String toString() {
        return "{" +
                nazwaDruzyny +
                " ranking:" + pozycjaWRankingu +
                ", siła:" + silaDruzyny +
                '}';
    }
}
