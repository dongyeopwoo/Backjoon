package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A10808 {
    public static void main(String[] args) throws IOException {
        //value=> index
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[26];
        char[] temp = br.readLine().toCharArray(); // 하나하나 들어오게 되어있음
        for(int i = 0; i < temp.length; i++){
            A[temp[i] - 97]++; //0번째 값을 ++해라
        }
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
    }
}
