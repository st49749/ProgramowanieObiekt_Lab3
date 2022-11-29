package Lab06;

public class Kwadrat extends Prostokat {
    public void setBokLength(double wys) {
        this.wys = wys;
        this.szer = wys;
    }

    public double getBokLength() {
        return this.wys;
    }

    public Punkt getPunkt() {
        return punkt;
    }

    public void setPunkt(Punkt punkt) {
        this.punkt = punkt;
    }

    public Kwadrat(Punkt punkt, double wys) {
        super(punkt, wys, wys);
    }

    @Override
    public String opis() {
        return "Klasa Kwadrat.";
    }
}