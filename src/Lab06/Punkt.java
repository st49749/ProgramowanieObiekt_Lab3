package Lab06;

public class Punkt {
    float x;
    float y;

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Punkt() {
        this.zeruj();
    }

    public Punkt(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void zeruj() {
        this.x = 0;
        this.y = 0;
    }

    public void opis() {
        System.out.println("Punkt: X "+ getX()  + " | Y " + getY());
    }

    public void przesun(float x, float y) {
        this.x += x;
        this.y += y;
    }

}
