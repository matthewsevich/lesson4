package by.watch;

import java.util.Date;

public abstract class AbstractWatch {

    private double price;

    public AbstractWatch() {

        System.out.println("Construct abstract watch");
    }
/*
    public AbstractWatch(double price) {
        this.price = price;
    }*/

    public void showTime() {
        System.out.println(new Date());
    }

    void printColor() {
        System.out.println("abstract color");
    }

    protected void printSize() {
        System.out.println("XXL");
    }

    private void printPrice() {
        System.out.println("1000 EUR");
    }

}
