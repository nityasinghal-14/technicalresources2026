import java.util.*;

public class a1_q8 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Enter the times of rotation");
        int k = scn.nextInt();
        int temp = n;
        int nod = 0;
        while (temp != 0) {
            nod++;
            temp = temp / 10;
        }
        System.out.println("Number of digits " + nod);
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }
        int div = 1;
        int multi = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div *= 10;
            } else {
                multi *= 10;
            }
        }
        int q = n / div;
        int rem = n % div;
        int r = rem * multi;
        int ron = r + q;
        System.out.println("Rotated Number is " + ron);
        scn.close();
    }
}
