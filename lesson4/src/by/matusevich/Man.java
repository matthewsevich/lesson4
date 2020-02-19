package by.matusevich;

import javax.xml.namespace.QName;

public class Man {
    int hairLength = 10;
    String name;

    public Man(){
        System.out.println("Call Default constructor");
    }

    public Man(int hairLength) {
        this.hairLength = hairLength;
    }

    public Man(String name){
        System.out.println("constructor with param " + name);
        this.name = name;

    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println("declare variable");
        Man max;
        System.out.println("init variable");
        max = new Man();
        System.out.println(max);
        Man max2 = new Man();
        System.out.println(max2);
        max2=max;
        System.out.println(max2);
        Man superman = new Man("Superman");
        System.out.println(superman.name);
        System.out.println(superman.hairLength);
    }
}
