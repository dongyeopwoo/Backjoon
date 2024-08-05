package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n3 = Integer.parseInt(st.nextToken());
        int n4 = Integer.parseInt(st.nextToken());
        int n5 = Integer.parseInt(st.nextToken());

        int sum = n*n + n2*n2 + n3*n3 + n4*n4 + n5*n5;

        System.out.println(sum % 10);
    }
}
