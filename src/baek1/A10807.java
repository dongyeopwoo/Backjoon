package baek1;

import java.io.*;
import java.util.StringTokenizer;

public class A10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());


        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for(int j = 0; j < arr.length; j++){
            if(b == arr[j]){
                count++;
            }
        }
        System.out.println(count);
        br.close();
        bw.flush();
        bw.close();

    }
}
