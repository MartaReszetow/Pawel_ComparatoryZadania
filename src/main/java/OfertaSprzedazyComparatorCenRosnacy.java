import java.util.Comparator;

public class OfertaSprzedazyComparatorCenRosnacy implements Comparator<OfertaSprzedazy> {


    @Override
    public int compare(OfertaSprzedazy o1, OfertaSprzedazy o2) {

        return Integer.compare(o1.getCena(), o2.getCena());
    }



}
