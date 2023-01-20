import java.util.*;

public class a2_q3 {
    public static void main(String[] args) {
        System.out.println("Enter number of rows");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int sp = n - 1, st = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}
