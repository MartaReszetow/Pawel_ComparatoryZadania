package zad3Ekstraklasa;

import zad3Ekstraklasa.DruzynaPilkarska;

import java.util.Comparator;

public class DruzynaPilkarskaComparatorProporcja implements Comparator<DruzynaPilkarska> {
    @Override
    public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {


        return Double.compare((o2.getSilaDruzyny()/o2.getPozycjaWRankingu()),(o1.getSilaDruzyny()/o1.getPozycjaWRankingu()));
    }
}
