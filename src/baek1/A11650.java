package baek1;

import java.io.*;
import java.util.Arrays;

public class A11650 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] X = new int[100];
        int[] Y = new int[100];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i<N; i++){
            X[i] = Integer.parseInt(br.readLine());
            Y[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(X);
        Arrays.sort(Y);

        bw.write(Arrays.toString(X));
        bw.write(Arrays.toString(Y));
        bw.flush();

    }
}
