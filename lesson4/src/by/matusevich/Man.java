package by.matusevich;

public class Man {
    public Man(){
        System.out.println("Call Default constructor");
    }
    public static void main(String[] args) {
        System.out.println("declare variable");
        Man max;
        System.out.println("init variable");
        max = new Man();
        System.out.println(max);
        Man max2 = new Man();
        System.out.println(max2);
        max2=max;
        System.out.println(max2);

    }
}
