package by.matusevich.FairyTale;

public class Vnuchka {

    public static final int VNUCHKA_SHARE = 15;

    public static Repka pullRepka(Repka repka, int leftWeight) throws VeryBigRepkaException {
        if (leftWeight > VNUCHKA_SHARE) {
            //need help
            Zhuchka zhuchka = new Zhuchka();
            return Zhuchka.pullRepka(repka, leftWeight - VNUCHKA_SHARE);
        } else {
            return repka;
        }
    }
}

