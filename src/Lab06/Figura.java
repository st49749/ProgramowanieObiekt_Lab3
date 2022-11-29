package Lab06;

public class Figura {
    Punkt punkt;
    String kolor = "bialy";


    public Figura(){
        punkt = new Punkt(0,0);
    }
    public Figura(String kolor){
        this.kolor=kolor;
    }
    public Figura(Punkt punkt){
        this.punkt=punkt;
    }
    public String getKolor(){
        return kolor;
    }

    public String opis(){
        return "Klasa Figura. Kolor obiektu: " + kolor;
    }
}