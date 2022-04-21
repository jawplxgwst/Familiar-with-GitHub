/**
* Name: James Wong
* Teacher: Mr Lee
* Date:
* Description:
 */

public class iterativeprocess {
    public static void main (String[] args){
        
        double x = 2;
        double y = 4;

        for (int i = 0; i<10; i++) {
            System.out.println(x);
            y = (x * x) - 2;
            x = y;
        }
        System.out.print(y);
    }
}
