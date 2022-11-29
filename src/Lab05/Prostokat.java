package Lab05;

public class Prostokat {
    double dlugosc, szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double ObliczPole() {
        return dlugosc * szerokosc;
    }

    public double ObliczDlugoscPrzekatnej() {
        return Math.sqrt((dlugosc * dlugosc) + (szerokosc * szerokosc));
    }
}
