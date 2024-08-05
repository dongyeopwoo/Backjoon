package baek1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        String M = br.readLine();

        if (N.length() < M.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}