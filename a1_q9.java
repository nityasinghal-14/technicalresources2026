import java.util.*;

public class a1_q9 {
    public static void main(String[] args) {
        System.out.println("Enter number1");
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        System.out.println("Enter number 2");
        int num2 = scn.nextInt();
        int div = num1;
        int did = num2;
        int old_rem = did % div;
        int new_rem = old_rem;
        while (new_rem != 0) {
            new_rem = div % old_rem;
            div = old_rem;
        }
        int gcd = div;
        System.out.println("GCD is " + gcd);
        int lcm = (num1 * num2) / gcd;
        System.out.println("LCM is " + lcm);
        scn.close();
    }

}
