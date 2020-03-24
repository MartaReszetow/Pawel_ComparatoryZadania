package zad3Ekstraklasa;

import zad3Ekstraklasa.DruzynaPilkarska;
import zad3Ekstraklasa.DruzynaPilkarskaComparatorProporcja;
import zad3Ekstraklasa.DruzynaPilkarskaComparatorRanking;

import java.util.ArrayList;
import java.util.List;

public class Main3DruzynaPilkarska {
    public static void main(String[] args) {

        List<DruzynaPilkarska> ekstraKlasa = new ArrayList<>();
        ekstraKlasa.add(new DruzynaPilkarska("Jagiellonia Bialystok", 8.0, 10.0));
        ekstraKlasa.add(new DruzynaPilkarska("Legia Warszawa", 1.0, 1.0));
        ekstraKlasa.add(new DruzynaPilkarska("Pogoń Szczecin", 6.0, 7.5));
        ekstraKlasa.add(new DruzynaPilkarska("Crakovia", 3.0, 7.0));
        ekstraKlasa.add(new DruzynaPilkarska("Piast Gliwice", 2.0, 7.5));
        ekstraKlasa.add(new DruzynaPilkarska("Lech Poznań", 5.0, 8.5));
        ekstraKlasa.add(new DruzynaPilkarska("Lechia Gdańsk", 7.0, 8.0));
        ekstraKlasa.add(new DruzynaPilkarska("Slask Wroclaw", 4.0, 7.0));

        System.out.println("Sortowanie po rankingu:");
        ekstraKlasa.sort(new DruzynaPilkarskaComparatorRanking());
        System.out.println(ekstraKlasa);
        System.out.println("Sortowanie po stosunku siły druzyny/pozycji w rankingu");
        ekstraKlasa.sort(new DruzynaPilkarskaComparatorProporcja());
        System.out.println(ekstraKlasa);
    }
}
