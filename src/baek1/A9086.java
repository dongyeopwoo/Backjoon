package baek1;

import java.io.*;
import java.util.StringTokenizer;

public class A9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            String s = br.readLine();
            bw.write(s.charAt(0));
            bw.write(s.charAt(s.length()-1)+"\n");
        }

        bw.flush();
        bw.close();
    }
}
