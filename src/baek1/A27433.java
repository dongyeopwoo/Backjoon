package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N < 0 || N >20) return;

        System.out.println(getFactorial(N));
    }

    public static long getFactorial(int num) {
        return num == 0 ||  num == 1 ? 1 : num * getFactorial(num -1);
    }
}
