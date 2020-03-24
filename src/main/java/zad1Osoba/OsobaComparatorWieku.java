package zad1Osoba;

import zad1Osoba.Osoba;

import java.util.Comparator;

public class OsobaComparatorWieku implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {

       return Integer.compare(o1.getWiek(),o2.getWiek());
    }
}
