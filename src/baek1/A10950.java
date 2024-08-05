package baek1;

import java.util.Scanner;

public class A10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }

    }
}
