package Lab06;

public class Prostokat extends Figura {
    double wys=0, szer=0;

    public Prostokat(Punkt punkt, double wys, double szer) {
        super(punkt);
        this.wys = wys;
        this.szer = szer;
    }

    public Prostokat(double wys, double szer, String kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    public Prostokat(double wys, double szer){
        this.wys = wys;
        this.szer = szer;

    }

    public double getPowierzchnia() {
        return (szer * wys);
    }

    public void przesun(float x, float y) {
        super.punkt.przesun(x, y);
    }

    @Override
    public String opis() {
        return "Klasa Prostokat.";
    }
}