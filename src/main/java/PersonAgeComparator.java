import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {

       return Integer.compare(o1.getWiek(),o2.getWiek());
    }
}
