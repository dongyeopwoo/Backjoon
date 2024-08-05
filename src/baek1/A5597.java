package baek1;

import java.io.*;

public class A5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[31]; // 30명의 학생 번호를 저장할 배열 (1~30 사용)

        // 28명의 출석 번호 입력받기
        for (int i = 1; i <= 28; i++) {
            int success = Integer.parseInt(br.readLine());
            arr[success] = 1;
        }

        int missingCount = 0;

        // 출석하지 않은 학생 번호 찾기
        for (int i = 1; i <= 30; i++) {
            if (arr[i] != 1) {
                bw.write(i + "\n");
                missingCount++;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
