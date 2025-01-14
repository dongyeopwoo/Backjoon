package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            arr[i] = Math.min(arr[i], arr[i + 1]);
            System.out.println(arr[i]);
        }
    }
}
