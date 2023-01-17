import java.util.*;

public class a1_q5 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = 0;
        int count = 0;
        while (n > 0) {
            m = n % 10;
            if (m > 0) {
                count = count + 1;
            }
            n = n / 10;
        }
        System.out.println("number of digits:" + count);
        scn.close();
    }

}
