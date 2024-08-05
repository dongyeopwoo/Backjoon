package baek1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class A2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int[] arrayList = new int[5];

        for (int i = 0; i < 5; i++) {
            arrayList[i] = Integer.parseInt(br.readLine());
            sum += arrayList[i];
        }

        Arrays.sort(arrayList);

        int avg = sum / 5;

        bw.write(avg + "\n");
        bw.write(arrayList[2] + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
