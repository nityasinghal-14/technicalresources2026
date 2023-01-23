import java.util.*;

public class a2_q14 {
    public static void main(String[] args) {
        System.out.println("EEnter number");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            int y = x * i;
            System.out.println(x + "*" + i + "=" + y);
        }
    }

}
