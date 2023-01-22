
import java.util.*;

public class a2_q10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = n / 2;
        int b = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= b; j++) {
                System.out.print("  ");
            }
            if (i > 1 && i < n) {
                System.out.print("*");
            }
            if (i <= n / 2) {
                a--;
                b += 2;
            } else {
                a++;
                b -= 2;
            }
            System.out.println();
        }
        scn.close();
    }

}
