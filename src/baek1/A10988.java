package baek1;

import java.util.Scanner;

public class A10988 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();

        int a = str.length();
        int ans = 1;

        for(int i = 0; i < a/2; i++){
            if(str.charAt(i) != str.charAt(a - 1 - i)) {
                ans = 0;
            }
        }

        System.out.println(ans);
    }
}
