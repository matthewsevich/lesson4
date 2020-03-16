package by.matusevich.FairyTale;

public class Myshka {

    public static final int MYSHKA_SHARE = 1;

    public static Repka pullRepka(Repka repka, int leftWeight) throws VeryBigRepkaException {
        if (leftWeight > MYSHKA_SHARE) {
            //exception
            throw new VeryBigRepkaException("Repka leftWeight is "+ (leftWeight-MYSHKA_SHARE));
        } else {
            return repka;
        }
    }
}
