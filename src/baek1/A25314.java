package baek1;

import java.io.*;
import java.util.StringTokenizer;

public class A25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        String str = "";

        for (int i = 0; i < n / 4; i++) {
            str += "long ";
        }

        bw.write(str + "int\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
