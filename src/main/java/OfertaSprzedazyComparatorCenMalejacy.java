import java.util.Comparator;

public class OfertaSprzedazyComparatorCenMalejacy implements Comparator<OfertaSprzedazy> {


    @Override
    public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {

        return Integer.compare(o2.getCena(), o1.getCena());
    }


}
