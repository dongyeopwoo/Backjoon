package baek1;

import java.util.Scanner;

public class A10809 {
    public static void main(String[] args) {

        //조건 : a~z까지 출력하되, 입력한 것의 위치를 알려주고 입력한 것의 알파벳이 없으면 -1를 출력한다.

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}

