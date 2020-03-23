import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.datatransfer.ClipboardOwner;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fifa implements Comparable<Fifa> {

    //4. Stwórz komparator porównujący drużyny piłkarskie zgodnie z zasadami FIFA. Tj.
    //Pola klasy DrużynaPiłkarska:
    //- nazwa drużyny
    //- bramki stracone,
    //- bramki trafione,
    //- mecze wygrane,
    //- mecze przegrane,
    //- mecze zremisowane,
    //- liczba punktów

    private String nazwaDruzyny;
    private int meczeWygrane;
    private int meczeZremisowane;
    private int meczePrzegrane;
    private int bramkiTrafione;
    private int bramkiStracone;
    private int liczbaPkt;

    @Override
    public String toString() {
        return "{" +
                nazwaDruzyny +
    //            "\t" + "Z:" + meczeWygrane +
    //            "\t" + " R:" + meczeZremisowane +
    //            "\t" + " P:" + meczePrzegrane +
                "\t" + " PKT:" + liczbaPkt +
                "\t" + " BZ:" + bramkiTrafione +
                "\t" + " BS:" + bramkiStracone +
                '}' + "\n";
    }

    @Override
    public int compareTo(Fifa competitor) {
        int result = Integer.compare( competitor.getLiczbaPkt(),liczbaPkt);
        if (result == 0) {
                result = Integer.compare(competitor.getBramkiTrafione(),bramkiTrafione);
                if (result == 0) {
                    result = Integer.compare(bramkiStracone,competitor.getBramkiStracone());
                    if (result == 0) {
                        result = this.nazwaDruzyny.compareTo(competitor.getNazwaDruzyny());
                    }
                }
            }
            return result;
        }
    }
