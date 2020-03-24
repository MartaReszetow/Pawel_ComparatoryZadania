package zad5Apteka;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.List;


public class Pharmacy implements Comparator<Customer> {


//Stwórz klasę apteka a w niej kolejkę klientów. dodawaj klientów do kolejki i sortuj je
//następująco:
//- osoby starsze powinny pójść możliwie na przód kolejki jeśli mają powyżej 60 lat, jeśli nie
//ustawiają się normalnie na koniec
//- osoby w ciąży mają priorytet nad wszystkimi
//(stwórz metody do sprawdzania kolejki - wypisywania wszystkich w kolejce)
//(użyj comparator i comparable)


    @Override
    public int compare(Customer o1, Customer o2) {

        if (o1.isPregnant() && !o2.isPregnant()) {
            return -1;
        }
        if (o1.isPregnant() && o2.isPregnant()) {
            if (o1.getJoiningQueue().isBefore(o2.getJoiningQueue())) {
                return -1;
            } else if (o1.getJoiningQueue().isAfter(o2.getJoiningQueue())) {
                return 1;
            }
        }
        if (!o1.isPregnant() && o2.isPregnant()) {
            return 1;
        }
        if (o1.getAge() >= 60 && o2.getAge() < 60) {
            return -1;
        }
        if ((o1.getAge() >= 60 && o2.getAge() >= 60) || (o1.getAge() < 60 && o2.getAge() < 60)) {
            if (o1.getJoiningQueue().isBefore(o2.getJoiningQueue())) {
                return -1;
            } else if (o1.getJoiningQueue().isAfter(o2.getJoiningQueue())) {
                return 1;
            }
        }
        if (o1.getAge() < 60 && o2.getAge() >= 60) {
            return 1;
        }
        if (o1.getJoiningQueue().isBefore(o2.getJoiningQueue())) {
            return -1;
        } else if (o1.getJoiningQueue().isAfter(o2.getJoiningQueue())) {
            return 1;
        }
        return 0;
    }


}


