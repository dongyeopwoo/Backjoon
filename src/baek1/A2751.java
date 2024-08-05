package baek1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class A2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arrayList = new int[N];

        for (int i = 0; i < N; i++) {
            arrayList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arrayList);

        for (int i : arrayList) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}