import java.util.*;

public class a2_q13 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Output-");
        for (int i = 0; i < n; i++) {
            int a = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                int b = (a * (i - j)) / (j + 1);
                a = b;
            }
            System.out.println();
        }
    }

}
