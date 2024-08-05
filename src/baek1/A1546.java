package baek1;

import java.util.Scanner;

public class A1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];

        int i;

        for(i = 0; i < N; i++){
            score[i] = sc.nextInt();
        }

        double sum = 0;
        double m = 0;

        for(i = 0; i < N; i++){
            if(score[i]>m){
                m = score[i];
            }
            sum += score[i];
        }

        System.out.println(sum*100/m/N);
    }
}
