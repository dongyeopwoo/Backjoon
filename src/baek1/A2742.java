package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N > 0){
            System.out.println(N);
            N--;
        }
    }
}
