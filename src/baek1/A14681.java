package baek1;

import java.util.Scanner;

public class A14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n2 = sc.nextInt();

        if(n >= 1 && n2 >= 1){
            System.out.println("1");
        }
        else if(n <= 1 && n2 >= 1){
            System.out.println("2");
        }
        else if(n <= 1 && n2 <= 1){
            System.out.println("3");
        }
        else if(n >= 1 && n2 <= 1){
            System.out.println("4");
        }
    }
}
