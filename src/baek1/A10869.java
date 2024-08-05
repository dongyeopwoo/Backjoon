package baek1;

import java.util.Scanner;

public class A10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int sc3 = A + B;
        int sc4 = A - B;
        int sc5 = A * B;
        int sc6 = A / B;
        int sc7 = A % B;

        System.out.println(sc3);
        System.out.println(sc4);
        System.out.println(sc5);
        System.out.println(sc6);
        System.out.println(sc7);
    }
}
