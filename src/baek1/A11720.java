package baek1;

import java.io.*;

public class A11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        String s = br.readLine();
        for (int i = 0; i < n; i++) {  // 인덱스를 0부터 n-1까지 순회
            sum += s.charAt(i) - '0'; // 문자열을 숫자로 변환
        }
        bw.write(String.valueOf(sum)); // 정수를 문자열로 변환하여 출력
        bw.flush();
        bw.close();
    }
}
