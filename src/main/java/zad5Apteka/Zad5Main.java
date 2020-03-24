package zad5Apteka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zad5Main {

    public static void main(String[] args) {
        List<Customer> queueToPharmacy = new ArrayList<>();


        try {
            queueToPharmacy.add(new Customer("Jan(5)", 10, false));    //5
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Stach(6)", 20, false));  //6
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Adam(7)", 30, false));   //7
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Kuba(8)", 40, false));   //8
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Wojtek(9)", 50, false)); //9
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Wojtek(3)", 60, false)); //3
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Ania(1)", 80, true));    //1
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Kasia(4)", 70, false));  //4
            Thread.sleep(1);
            queueToPharmacy.add(new Customer("Basia(2)", 15, true));   //2

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Collections.shuffle(queueToPharmacy);

        System.out.println("POSORTOWANE:");
        queueToPharmacy.sort(new Pharmacy());
        System.out.println(queueToPharmacy);
    }
}
