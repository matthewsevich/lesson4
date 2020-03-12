package by.watch;

public class NewQuartzwatch extends QuartzWatch  {

    private Showable showable;

    public NewQuartzwatch(Showable showable){
        this.showable=showable;
    }

    @Override
    public void showTime() {
        showable.showTime();
    }
}
