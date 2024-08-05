package baek1;

import java.util.Scanner;

public class A10101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;

        if(a == 60 && b == 60 && c == 60){
            System.out.println("Equilateral");
        } else if (sum == 180 && (a == b || a == c || b == c)){
            System.out.println("Isosceles");
        } else if (sum == 180 && ( a != b || a!= c || b !=c)){
            System.out.println("Scalene");
        } else if( sum != 180){
            System.out.println("Error");
        }
    }
}
