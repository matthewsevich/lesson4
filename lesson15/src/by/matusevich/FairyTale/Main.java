package by.matusevich.FairyTale;

public class Main {

    public static void main(String[] args) {
        try {
            Ded ded=new Ded();
            ded.plantRepka();
            ded.growRepka(77);
            Repka repka=ded.pullRepka();
            System.out.println(repka);
        } catch (Throwable e){
            e.printStackTrace();
            System.exit(-1);

        } finally {
            System.out.println("тут и сказке конец");
        }

    }
}
