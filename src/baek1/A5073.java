package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A5073 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayList = new int[3];

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrayList[0] = Integer.parseInt(st.nextToken());
            arrayList[1] = Integer.parseInt(st.nextToken());
            arrayList[2] = Integer.parseInt(st.nextToken());

            if(arrayList[0] == 0 & arrayList[1] == 0 && arrayList[2] == 0) break;

            Arrays.sort(arrayList);

            if(arrayList[2] >= arrayList[0] + arrayList[1]) {
                System.out.println("Invalid");
            }else if(arrayList[0] == arrayList[1] && arrayList[1] == arrayList[2]) {
                System.out.println("Equilateral");
            }else if(arrayList[0] == arrayList[1] || arrayList[1] == arrayList[2] || arrayList[0] == arrayList[2]) {
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }
        }
    }
}
