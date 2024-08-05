package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] arr = new int[100];
        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] < 40){
                arr[i] = 40;
            }
            sum += arr[i];
        }
        System.out.println(sum/5);

    }
}
