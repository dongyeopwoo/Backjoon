package baek1;

import java.io.*;

public class A3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        int[] arr = new int[42];

        for(int i = 0; i < 10; i++) {
            int number = Integer.parseInt(br.readLine());
            int remainder = number % 42;
            arr[remainder]++;
        }

        for(int i = 0; i < 42; i++) {
            if(arr[i] > 0) count ++;
        }

        System.out.println(count);
    }
}
