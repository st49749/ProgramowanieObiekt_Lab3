import Lab05.Budynek;
import Lab05.Gatunek;
import Lab05.Prostokat;
import Lab06.*;

public class Main {
    public static void main(String[] args) {
        // LAB 05 Zad 1
        var prost1 = new Prostokat(10, 20);
        prost1.ObliczDlugoscPrzekatnej();
        prost1.ObliczPole();

        // LAB 05 Zad 2
        var bud1 = new Budynek("A", 1950, 2);
        var bud2 = new Budynek("B", 1960, 3);
        var bud3 = new Budynek("C", 1970, 4);
        bud1.getRokBudowy();
        bud1.getWiekBudynku();
        bud1.getNazwa();
        bud1.getLiczbaPieter();
        bud1.print();

        // LAB 05 Zad 3
        var gat = new Gatunek("RodzajA", "GatA", 10, 20);
        gat.podajPelnaNazwe();
        gat.print();
        gat.getHaploidalnaLiczbaChromosomowN();
        var clone = gat.getClone();

        // LAB 06 Zad 1.07
        var pkt1 = new Punkt();
        var pkt2 = new Punkt(3, 4);
        var pkt3 = new Punkt(5, 6);
        pkt1.getY();
        pkt1.getX();
        pkt1.setX(1);
        pkt1.setY(2);
        pkt1.zeruj();
        pkt1.opis();
        pkt1.przesun(10, 20);

        // LAB 06 Zad 1.09
        var fig = new Figura();
        fig.getKolor();
        fig.opis();

        var prost2 = new Lab06.Prostokat(pkt1, 10, 20);
        prost2.getPowierzchnia();
        prost2.przesun(2,2);

        var trojk = new Trojkat(5, 10, "czarny");

        // LAB 06 Zad 1.15
        prost2.przesun(10, 20);

        // LAB 06 Zad 1.17
        var kwad = new Kwadrat(pkt2, 10);

        // LAB 06 Zad 1.19
        System.out.println(fig.opis());
        System.out.println(prost2.opis());
        System.out.println(trojk.opis());
        System.out.println(kwad.opis());

        // LAB 06 Zad 2
        var s1 = new Samochod("A", "B", "C", "D", 2020, 10000);
        var s2 = new SamochodOsobowy("A", "B", "C", "D", 2020, 10000, 1000, 2000, 5);
        s1.print();
        s2.print();

        // LAB 06 Zad 3
        Ksiegarnia ksiegarnia = new Ksiegarnia("Moja ksiegarnia");
        Klient klient = new Klient("Jan", "Kowalski");
        Ksiazka ksiazka1 = new Powiesc("PowiescA", "Michał Grab", "Jan Soplica");
        Ksiazka ksiazka2 = new Podrecznik("PodrA", "Michał Buk", "Informatyka");

        ksiegarnia.dodajKlienta(klient);
        ksiegarnia.dodajKsiazke(ksiazka1);
        ksiegarnia.dodajKsiazke(ksiazka2);
    }
}