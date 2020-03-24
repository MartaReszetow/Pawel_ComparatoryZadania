package zad2OfertaSprzedazy;

import zad2OfertaSprzedazy.OfertaSprzedazy;

import java.util.List;

public class OfertaSprzedazyComparatorCen {

    public static void wybierzMetodeSortowania(List<OfertaSprzedazy> list, boolean czyRosnacy){
        if (czyRosnacy){
            list.sort(new OfertaSprzedazyComparatorCenRosnacy());
        }
        else {
            list.sort(new OfertaSprzedazyComparatorCenMalejacy());
        }

    }

}
