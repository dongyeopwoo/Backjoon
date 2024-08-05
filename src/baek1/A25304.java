package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class A25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Long.parseLong(br.readLine());
        long n = Long.parseLong(br.readLine());


        StringTokenizer st ;



        long c = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            c = a * b;
            sum += c;
        }
        if(x == sum){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
