package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[N][M];

        // 첫 번째 행렬 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 두 번째 행렬 입력 받기
        int[][] arr2 = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 두 행렬을 더하여 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
