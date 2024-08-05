package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A25372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            // 비밀번호 길이가 6보다 크고 9보다 작은지 확인
            if (s.length() >= 6 && s.length() <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        br.close();
    }
}
