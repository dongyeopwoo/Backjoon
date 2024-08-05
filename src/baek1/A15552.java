package baek1;

import java.io.*;
import java.util.StringTokenizer;

public class A15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st ;

        for(int i = 1; i <= T; i++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sum = A+B;


            bw.write(sum+"\n");
        }
        bw.flush();

    }
}
