package zad4Fifa;

import zad4Fifa.Fifa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main4Fifa {

    public static void main(String[] args) {


        List<Fifa> ekstraKlasaFifaranking = new ArrayList<>();
        ekstraKlasaFifaranking.add(new Fifa("Legia Warszawa", 16, 3, 7, 54, 26, 51));
        ekstraKlasaFifaranking.add(new Fifa("Piast Gliwice", 13, 4, 9, 28, 25, 43));
        ekstraKlasaFifaranking.add(new Fifa("Crakovia", 13, 3, 10, 45, 25, 42));
        ekstraKlasaFifaranking.add(new Fifa("Slask Wroclaw", 11, 9, 6, 34, 29, 42));
        ekstraKlasaFifaranking.add(new Fifa("Lech Poznań", 11, 9, 6, 45, 25, 42));
        ekstraKlasaFifaranking.add(new Fifa("Pogoń Szczecin", 11, 8, 7, 27, 23, 41));
        ekstraKlasaFifaranking.add(new Fifa("Lechia Gdańsk", 10, 8, 8, 32, 33, 38));
        ekstraKlasaFifaranking.add(new Fifa("Jagiellonia Bialystok", 10, 7, 9, 35, 35, 37));
        System.out.println("tabela wg zwykłego rankingu:");
        System.out.println(ekstraKlasaFifaranking);
        System.out.println("tabela wg naszego rankingu:");
        Collections.sort(ekstraKlasaFifaranking);
        System.out.println(ekstraKlasaFifaranking);


    }
}
