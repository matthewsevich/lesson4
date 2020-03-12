package by.watch;

import java.util.Date;

public class QuartzWatch extends AbstractWatch{

    @Override
    public void showTime() {
        System.out.println("Show time quartz watch "+ new Date());
    }

    @Override
    void printColor() {
        System.out.println("quartz watch color green");
    }
}
