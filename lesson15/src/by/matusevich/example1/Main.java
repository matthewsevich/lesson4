package by.matusevich.example1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger log=Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Divider divider = new Divider();

        double r1= callDivider(divider,1,2);
        double r2= callDivider(divider,1,0);
        callDivider(null,1,0);

        System.out.println(r1);
        log.info("result1 = "+r1);
        System.out.println(r2);
        log.info(("result2= "+r2));
    }
    public static double callDivider(Divider divider, int a,int b){
        // no code
        try {
            return divider.divide(a,b);
        } catch (Exception e) {
            log.log(Level.SEVERE,"callDivider has an error", e);

            //System.out.println(e);
            // e.printStackTrace();
            //return -1;

        }
        //no code
        return -1;
    }
}
