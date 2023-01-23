import java.util.*;

public class a2_q12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                c = a + b;
                System.out.print(a + " ");
                a = b;
                b = c;

            }
            System.out.println();
        }

    }

}
