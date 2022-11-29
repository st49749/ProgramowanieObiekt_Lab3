package Lab05;

import java.time.LocalDate;
import java.time.LocalTime;

public class Budynek {
    String nazwa;
    int rokBudowy;
    int liczbaPieter;

    public String getNazwa() {
        return nazwa;
    }

    public int getRokBudowy() {
        return rokBudowy;
    }

    public int getLiczbaPieter() {
        return liczbaPieter;
    }

    public Budynek(String nazwa, int rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }

    public void print() {
        System.out.println("Nazwa: " + getNazwa() + " | Rok budowy: " + getRokBudowy() + " | Liczba pieter: " + getLiczbaPieter());
    }

    public int getWiekBudynku() {
        LocalDate date = LocalDate.of(2020, 11, 25);
        var currentYear = date.getYear();
        return (currentYear - getRokBudowy());
    }
}
