import java.util.*;

public class a1_q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inv = 0;
        int op = 1; // original_place
        while (n != 0) {
            int od = n % 10; // original_digit
            int id = op; // inverted_digit
            int ip = od; // inverted_place

            // make change to inv using ip and id
            inv = inv + id * (int) Math.pow(10, ip - 1);

            n = n / 10;
            op++;
        }
        System.out.println("Inverted number" + inv);
        scn.close();
    }

}
