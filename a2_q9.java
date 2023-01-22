import java.util.*;

public class a2_q9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (j == i || i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
