import java.awt.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== Sunkesnis UŽDAVINYS - 4 ======");

        int starLine = 25;

        for (int i = 0; i < starLine; i++) {
            for (int a = 0; a < starLine; a++) {
                if ( a == i || starLine - a == i + 1 ){
                    System.out.print("3 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }



        // testas


    }
}