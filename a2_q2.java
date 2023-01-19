import java.util.*;

public class a2_q2 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for (int i = 0; i < n; i++) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
