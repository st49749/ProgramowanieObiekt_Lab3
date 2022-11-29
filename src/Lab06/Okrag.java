package Lab06;

public class Okrag extends Figura {
    Punkt srodek;
    double promien;

    public Okrag() {
        this.promien = 0;
        this.srodek = new Punkt(0,0);
    }

    Okrag(Punkt srodek, double promien){
        this.srodek = srodek;
        this.promien = promien;
    }

    double getPowierzchnia() {
        return Math.PI * promien * promien;
    }

    public Punkt getSrodek() {
        return srodek;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public boolean wSrodku(Punkt pkt) {
        return Math.pow((srodek.x - pkt.x), 2) + Math.pow((srodek.y - pkt.y), 2) <= Math.pow(promien, 2);
    }

    @Override
    public String opis() {
        return "Klasa Okrag.";
    }
}