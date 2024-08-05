package baek1;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class A1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();

        Integer[] arrayList = new Integer[N.length()];

        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = N.charAt(i) - '0';
        }

        Arrays.sort(arrayList, Collections.reverseOrder());

        for (int i = 0; i < arrayList.length; i++) {
            bw.write(arrayList[i].toString());
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
