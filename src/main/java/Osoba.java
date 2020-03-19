import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;

    @Override
    public String toString() {
        return "{"+ imie + " "
                 + nazwisko +
                ", wiek:" + wiek +
                '}';
    }
}
