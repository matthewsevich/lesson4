package by.watch;

import java.util.Date;

public class MechanicalWatch extends AbstractWatch implements Showable {


   /* public MechanicalWatch() {
        System.out.println("construct mechanical watch");
    }*/


    public MechanicalWatch(double price) {
        //super(price);
        System.out.println("Construct mechanical watch price="+ price);
    }

    @Override
    void printColor() {
        System.out.println("Black Mechanical Watch");
    }

    @Override
    public void printSize() {
        System.out.println("M");
    }
    public void showTime(String format){
        System.out.println(format+new Date());
        super.showTime();

    }
    @Override
    public void showTime() {
        System.out.println("mechanical watch show time"+ new Date());
    }
}
