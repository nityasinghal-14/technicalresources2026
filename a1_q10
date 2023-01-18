import java.util.*;

public class a1_q10 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int div = 2; div * div <= n; div++) {
            while (n % div == 0) {
                System.out.println(div + " ");
                n = n / div;
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
        scn.close();
    }
}
