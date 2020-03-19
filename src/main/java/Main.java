import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Osoba> listaOsob = new ArrayList<>();
        listaOsob.add(new Osoba("Ala","Czarownica",50 ));
        listaOsob.add(new Osoba("Grześ","Wieś",12 ));
        listaOsob.add(new Osoba("Hubba","Bubba",10 ));
        listaOsob.add(new Osoba("Jan","Kochanowski",25 ));
        listaOsob.add(new Osoba("Mikołaj","Kopernik",32 ));
        listaOsob.add(new Osoba("Mikołaj","święty",100 ));
        listaOsob.add(new Osoba("Zajączek","Wielkanocny",150 ));
        listaOsob.add(new Osoba("Harry","Potter",10 ));
        System.out.println("Przed posortowaniem:");
        System.out.println(listaOsob);
        System.out.println("Po posortowaniu:");
        listaOsob.sort(new PersonAgeComparator());
        System.out.println(listaOsob);
    }
}
