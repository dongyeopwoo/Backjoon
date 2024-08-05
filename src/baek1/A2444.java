package baek1;

import java.io.IOException;
import java.util.Scanner;

public class A2444 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n - i; j++ ) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i*2 -1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 1; i <= n - 1 ; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= ((n - i) * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}