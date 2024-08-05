package baek1;

import java.io.*;
import java.util.StringTokenizer;

public class A11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int t = 1; t <= T; t++) {
            String input = br.readLine();
            st = new StringTokenizer(input);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sum = A + B;

            bw.write("Case #" + t + ": " + sum + "\n");
        }
        bw.flush();
    }
}
