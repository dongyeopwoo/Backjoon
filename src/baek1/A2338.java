package baek1;

import java.io.*;
import java.math.BigInteger;

public class A2338 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        BigInteger sum = A.add(B);
        BigInteger diff = A.subtract(B);
        BigInteger pro = A.multiply(B);

        bw.write(sum.toString() + "\n");
        bw.write(diff.toString() + "\n");
        bw.write(pro.toString() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
