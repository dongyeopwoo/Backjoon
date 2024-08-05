package baek1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int index = 0;
        int[] numbers = new int[n];

        while(st.hasMoreTokens()){
            numbers[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(numbers);
        System.out.println(numbers[0] + " " + numbers[n-1]);

    }
}
