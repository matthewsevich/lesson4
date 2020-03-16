package by.matusevich.FairyTale;

public class Zhuchka {

    public static final int ZHUCHKA_SHARE = 10;

    public static Repka pullRepka(Repka repka, int leftWeight) throws VeryBigRepkaException {
        if (leftWeight > ZHUCHKA_SHARE) {
            //need help
             Koshka koshka= new Koshka();
            return Koshka.pullRepka(repka, leftWeight - ZHUCHKA_SHARE);
        } else {
            return repka;
        }
    }
}

