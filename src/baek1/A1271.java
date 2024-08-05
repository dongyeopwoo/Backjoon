package baek1;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class A1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");

        BigInteger N = new BigInteger(st.nextToken());
        BigInteger M = new BigInteger(st.nextToken());

        BigInteger quotient = N.divide(M);
        BigInteger remainder = N.remainder(M);

        bw.write(quotient.toString() + "\n");
        bw.write(remainder.toString()+ "\n");
        bw.flush();
        bw.close();

    }
}
