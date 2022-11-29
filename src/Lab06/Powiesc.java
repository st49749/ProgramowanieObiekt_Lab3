package Lab06;

public class Powiesc extends Ksiazka {
    String glownyBohater;

    public Powiesc(String tytul, String autor, String glownyBohater) {
        super(tytul, autor);
        this.glownyBohater = glownyBohater;
    }
}
