package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int min_f = Math.min(A, Math.min(B, C)); //3줄을 받아서 ABC중에 제일 작은 걸 여기다 넣겠다.

        int D = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        int min_s = Math.min(A, Math.min(D, F)); //음류중에 제일 싼 애

        System.out.println(min_f + min_s - 50);
    }
}
