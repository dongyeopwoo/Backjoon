package baek1;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class A10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[][] Member = new String[N][2];

        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            Member[i][0] = input[0];
            Member[i][1] = input[1];
        }

        Arrays.sort(Member, new Comparator<String[]>() {
            @Override
            public int compare(String[] age, String[] name) {
                return Integer.parseInt(age[0]) - Integer.parseInt(name[0]);
            }
        });

        for(int i =0; i < N; i++){
            bw.write(Member[i][0] + " " + Member[i][1]);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
