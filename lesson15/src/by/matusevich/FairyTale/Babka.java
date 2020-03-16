package by.matusevich.FairyTale;

public class Babka {

    public static final int BABKA_SHARE=20;

    public Repka pullRepka(Repka repka, int leftWeight) throws VeryBigRepkaException {
        if (leftWeight>BABKA_SHARE){
            //need help
            Vnuchka vnucka=new Vnuchka();
            return Vnuchka.pullRepka(repka,leftWeight-BABKA_SHARE);
        } else {
            return repka;
        }
    }
}
