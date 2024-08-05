package baek1;

import java.io.*;
import java.util.StringTokenizer;

public class A8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}
