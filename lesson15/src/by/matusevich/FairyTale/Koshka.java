package by.matusevich.FairyTale;

public class Koshka {

    public static final int KOSHKA_SHARE = 5;

    public static Repka pullRepka(Repka repka, int leftWeight) throws VeryBigRepkaException {

        if (leftWeight > KOSHKA_SHARE) {
            //need help
            Myshka myshka = new Myshka();
            return Myshka.pullRepka(repka, leftWeight - KOSHKA_SHARE);
        } else {
            return repka;
        }
    }

}

