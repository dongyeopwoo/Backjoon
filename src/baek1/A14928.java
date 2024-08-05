package baek1;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class A14928 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        long remainder = 0;
        for (int i = 0; i < num.length(); i++) {
            remainder = (remainder * 10 + (num.charAt(i)-'0')) % 20000303;
        }

        System.out.println(remainder);
        sc.close();

    }
}
