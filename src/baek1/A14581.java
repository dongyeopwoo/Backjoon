package baek1;

import java.io.*;

public class A14581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String B = br.readLine();
        String c = ":fan:";
        bw.write(c + c + c + "\n");
        bw.write(c + ":" + B + ":" + c + "\n");
        bw.write(c + c + c + "\n");
        bw.flush();
        bw.close();
    }
}

