package baek1;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class A1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] word = new String[N];

        for(int i = 0; i < N; i++){
            word[i] = br.readLine();
        }

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 길이가 같으면 사전 순 정렬
                } else {
                    return Integer.compare(o1.length(), o2.length()); // 길이를 기준으로 정렬
                }
            }
        });

        String previous = "";

        for(int i = 0; i < N; i++){
            if (!word[i].equals(previous)) { // 중복된 단어는 출력하지 않음
                bw.write(word[i] + "\n");
                previous = word[i];
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
