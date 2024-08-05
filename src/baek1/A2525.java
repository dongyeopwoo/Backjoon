package baek1;

import java.util.Scanner;

public class A2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n1 = sc.nextInt();

        int n2 = sc.nextInt();

        int min = 60 * n + n1;
        min += n2;

        int hour = min / 60 % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}