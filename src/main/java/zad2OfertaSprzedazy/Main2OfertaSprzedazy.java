package zad2OfertaSprzedazy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2OfertaSprzedazy {
    public static void main(String[] args) {


        List<OfertaSprzedazy> listaSprzedazy = new ArrayList<>();
        listaSprzedazy.add(new OfertaSprzedazy("Cocacola", 3.50));
        listaSprzedazy.add(new OfertaSprzedazy("Pepsi", 4.00));
        listaSprzedazy.add(new OfertaSprzedazy("Muszynianka", 2.30));
        listaSprzedazy.add(new OfertaSprzedazy("Fiji", 8.50));
        listaSprzedazy.add(new OfertaSprzedazy("Costa", 12.50));
        listaSprzedazy.add(new OfertaSprzedazy("Starbucks", 18.99));
        listaSprzedazy.add(new OfertaSprzedazy("Oranżada w proszku", 0.50));

   /*     System.out.println("Przed posortowaniem:");
        System.out.println(listaSprzedazy);
        System.out.println("Po posortowaniu rosnąco:");
        zad2OfertaSprzedazy.OfertaSprzedazyComparatorCen.wybierzMetodeSortowania(listaSprzedazy, true);
        System.out.println(listaSprzedazy);
        System.out.println("Po posortowaniu malejaco:");
        zad2OfertaSprzedazy.OfertaSprzedazyComparatorCen.wybierzMetodeSortowania(listaSprzedazy, false);
        System.out.println(listaSprzedazy);
   */


        System.out.println("Napisz co chcesz zrobić :\n" +
                "- jeśli chcesz wyświetlić listę produktów wpisz - \"LISTA\" \n" +
                "- jeśli chcesz wyświetlić postortować listę rosnąco (wedlug ceny produktów) wpisz -\"SORTUJ ROSNACO\" \n" +
                "- jeśli chcesz wyświetlić postortować listę malejąco (wedlug ceny produktów)  wpisz - \"SORTUJ MALEJCO\" \n" +
                "- jeśli chcesz dodać produkt do listy  wpisz - \"DODAJ NAZWA_PRODUKTU CENA_PRODUKTU\" " +
                "- jeśli chcesz przerwać działanie programu wpisz- \"STOP\" ");

        Scanner scan = new Scanner(System.in);
        String komenda;

        do {
            komenda = scan.nextLine().toUpperCase();
            if (komenda.equals("LISTA")) {
                System.out.println(listaSprzedazy);
            }
            if (komenda.equals("SORTUJ ROSNACO")) {
                OfertaSprzedazyComparatorCen.wybierzMetodeSortowania(listaSprzedazy, true);
            }
            if (komenda.equals("SORTUJ MALEJACO")) {
                OfertaSprzedazyComparatorCen.wybierzMetodeSortowania(listaSprzedazy, false);
            }
            if (komenda.startsWith("DODAJ")) {
                String[] dodawanieProduktu = komenda.split(" ");
                listaSprzedazy.add(new OfertaSprzedazy(dodawanieProduktu[1], Double.parseDouble(dodawanieProduktu[2])));
            }
        }
        while (!komenda.equals("STOP"));
    }



}
