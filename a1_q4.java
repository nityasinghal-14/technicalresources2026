import java.util.*;

public class a1_q4 {
    public static void main(String[] args) {
        System.out.println("Enter the lower limit of range");
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        System.out.println("Enter the upper limit of range");
        int high = scn.nextInt();
        for (int i = low; i < high; i++) {
            if (i == 11) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    ;
                continue;
            }
            System.out.println(" " + i + " ");
        }
        scn.close();
    }
}
