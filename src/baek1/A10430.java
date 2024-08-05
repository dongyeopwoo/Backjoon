package baek1;

import java.util.Scanner;

public class A10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sc1 = sc.nextInt();
        int sc2 = sc.nextInt();
        int sc3 = sc.nextInt();

        int sc12 = (sc1 + sc2) % sc3;
        int sc13 = ((sc1 % sc3) + (sc2%sc3))%sc3;
        int sc14 = (sc1 * sc2) % sc3;
        int sc15 = ((sc1 % sc3) * (sc2%sc3))%sc3;

        System.out.println(sc12);
        System.out.println(sc13);
        System.out.println(sc14);
        System.out.println(sc15);
    }
}
