package by.matusevich.FairyTale;

public class Repka {

    private int weight;

    public void grow(int kilo){
        weight=kilo;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Repka{" +
                "weight=" + weight +
                '}';
    }
}
