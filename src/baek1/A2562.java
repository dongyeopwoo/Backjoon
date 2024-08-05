package baek1;

import java.io.*;

public class A2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[9];
        int max = arr[0]; //최대값의 값
        int index = 0; //최대값의 위치

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) {
                max = arr[i];
                index = i+1;
            }
        }
        bw.write(max + "\n");
        bw.write(index + "");
        bw.flush();
        bw.close();
    }
}
