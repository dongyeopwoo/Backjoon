package baek1;

import java.io.*;
import java.util.StringTokenizer;

public class A5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int n4 = Integer.parseInt(br.readLine());
        int n5 = Integer.parseInt(br.readLine());

        int sum = n1 + n2 + n3 + n4 + n5;

        System.out.println(sum);

    }
}
