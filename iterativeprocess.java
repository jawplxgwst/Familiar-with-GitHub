/**
* Name: James Wong
* Teacher: Mr Lee
* Date:
* Description:
 */

public class iterativeprocess {
    public static void main (String[] args){

        double y = 0;
        double w = 2;

        for (int i = 0; i<10; i++) {
            System.out.println(w);
            y = (w * w) - 2;
            w = y;
        }
    }
}
