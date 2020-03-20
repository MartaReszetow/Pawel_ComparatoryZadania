import java.util.Comparator;

public class DruzynaPilkarskaComparatorRanking implements Comparator<DruzynaPilkarska> {
    @Override
    public int compare(DruzynaPilkarska o1, DruzynaPilkarska o2) {
        return Double.compare(o1.getPozycjaWRankingu(),o2.getPozycjaWRankingu());
    }
}
