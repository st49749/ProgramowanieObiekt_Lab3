package Lab05;

public class Gatunek {
    String nazwaRodzaju, nazwaGatunkowa;
    int liczbaChromosomow2n, podstawowaLiczbaChromosomow;

    public Gatunek(String nazwaRodzaju, String nazwaGatunkowa, int liczbaChromosomow2n, int podstawowaLiczbaChromosomow) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunkowa = nazwaGatunkowa;
        this.liczbaChromosomow2n = liczbaChromosomow2n;
        this.podstawowaLiczbaChromosomow = podstawowaLiczbaChromosomow;
    }

    public String podajPelnaNazwe() {
        return nazwaRodzaju + " " + nazwaGatunkowa;
    }

    public int getHaploidalnaLiczbaChromosomowN() {
        return liczbaChromosomow2n;
    }

    public void print() {
        System.out.println("Nazwa rodzaju: " + nazwaRodzaju + " | nazwa gatunku " + nazwaGatunkowa + " | liczba chrom 2n: " + liczbaChromosomow2n + " | podstawowa liczba chrom: " + podstawowaLiczbaChromosomow);
    }

    public Gatunek getClone() {
        return new Gatunek(nazwaRodzaju, nazwaGatunkowa, liczbaChromosomow2n, podstawowaLiczbaChromosomow);
    }

}
