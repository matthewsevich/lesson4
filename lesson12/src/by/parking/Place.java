package by.parking;

public class Place<T extends Car> {

    private T car;

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }


    public boolean isEmpty(){
        return car==null;
    }
}
