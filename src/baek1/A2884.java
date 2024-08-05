package baek1;

import java.util.Scanner;

public class A2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n1 = sc.nextInt();

        int n2 = n1 - 45;

        if (n2 < 0) {
            n1 = n2 + 60;
            n = n - 1;

            if (n < 0) {
                n = 23;
            }
        } else {
            n1 = n2;
        }

        System.out.println(n + " " + n1);
    }
}