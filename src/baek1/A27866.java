package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int n = Integer.parseInt(br.readLine()) -1; //charAt은 0번째부터 시작하기때문에 -1를 해줌

        br.close();

        System.out.println(st.charAt(n)); //charAt를 통해 n번째 문자 출력하게 만듦

    }
}
