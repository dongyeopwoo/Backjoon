package baek1;

import java.util.Scanner;

public class A2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 0;

        for(int i = 1; i <= 9; i++){
            c = n * i;
            System.out.println(n + " * " + i + " = " + c);
        }
    }
}
