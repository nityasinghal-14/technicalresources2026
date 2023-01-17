import java.util.*;

public class a1_q6 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = 0;
        int b = 0;
        while (n > 0) {
            b = n % 10;
            n = n / 10;
            m = m * 10 + b;
        }
        System.out.print("Reversed number is " + m);
        scn.close();
    }
}
