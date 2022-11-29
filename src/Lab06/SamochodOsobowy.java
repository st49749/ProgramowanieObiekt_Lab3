package Lab06;

public class SamochodOsobowy extends Samochod {
    double waga, pojemnoscSilnika;
    int iloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.iloscOsob = iloscOsob;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        var temp = waga;
        if(temp < 2)
            temp = 2;

        if(temp > 4.5)
            temp = 4.5;

        this.waga = temp;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        var temp = pojemnoscSilnika;
        if(temp < 0.8)
            temp = 0.8;

        if(temp > 3)
            temp = 3;

        this.pojemnoscSilnika = temp;
    }

    public int getIloscOsob() {
        return iloscOsob;
    }

    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }

    @Override
    public void print() {
        System.out.println("Marka " + getMarka()
                + " | Model " + getModel()
                + " | Nadwozie " + getNadwozie()
                + " | kolor " + getKolor()
                + " | rok prod " + getRokProdukcji()
                + " | przebieg " + getPrzebieg()
                + " | waga " + getWaga()
                + " | poj silnika " + getPojemnoscSilnika()
                + " | ilosc osob " + getIloscOsob()
        );
    }
}
