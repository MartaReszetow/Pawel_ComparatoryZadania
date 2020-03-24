package zad5Apteka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zad5Main {

    public static void main(String[] args) {
        List<Customer> queueToPharmacy = new ArrayList<>();


        try {
            queueToPharmacy.add(new Customer("Jan", 10, false));
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Stach", 20, false));
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Adam", 30, false));
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Kuba", 40, false));
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Wojtek", 50, false));
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Wojtek", 60, false));
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Ania", 80, true));
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Kasia", 70, false));
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Basia", 15, true));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Collections.shuffle(queueToPharmacy);

        System.out.println("POSORTOWANE:");
        queueToPharmacy.sort(new Pharmacy());
        System.out.println(queueToPharmacy);
    }
}
