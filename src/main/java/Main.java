import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(new Osoba("Ala", "Czarownica", 50));
        listaOsob.add(new Osoba("Grześ", "Wieś", 12));
        listaOsob.add(new Osoba("Hubba", "Bubba", 10));
        listaOsob.add(new Osoba("Jan", "Kochanowski", 25));
        listaOsob.add(new Osoba("Mikołaj", "Kopernik", 32));
        listaOsob.add(new Osoba("Mikołaj", "święty", 100));
        listaOsob.add(new Osoba("Zajączek", "Wielkanocny", 150));
        listaOsob.add(new Osoba("Harry", "Potter", 10));
        System.out.println("Przed posortowaniem:");
        System.out.println(listaOsob);
        System.out.println("Po posortowaniu:");
        listaOsob.sort(new OsobaComparatorWieku());
        System.out.println(listaOsob);

        List<OfertaSprzedazy> listaSprzedazy = new ArrayList<>();
        listaSprzedazy.add(new OfertaSprzedazy("Cocacola", 3));
        listaSprzedazy.add(new OfertaSprzedazy("Pepsi", 4));
        listaSprzedazy.add(new OfertaSprzedazy("Muszynianka", 2));
        listaSprzedazy.add(new OfertaSprzedazy("Fiji", 8));
        listaSprzedazy.add(new OfertaSprzedazy("Costa", 12));
        listaSprzedazy.add(new OfertaSprzedazy("Starbucks", 18));
        listaSprzedazy.add(new OfertaSprzedazy("Oranżada w proszku", 1));

        System.out.println("Przed posortowaniem:");
        System.out.println(listaSprzedazy);
        System.out.println("Po posortowaniu rosnąco:");
        OfertaSprzedazyComparatorCen.wybierzMetodeSortowania(listaSprzedazy, true);
        System.out.println(listaSprzedazy);
        System.out.println("Po posortowaniu malejaco:");
        OfertaSprzedazyComparatorCen.wybierzMetodeSortowania(listaSprzedazy,false);
        System.out.println(listaSprzedazy);
    }
}
