package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 등수 매기기
public class BJ_2012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] rankings = new int[N];

        for (int i = 0; i < N; i++) {
            rankings[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rankings);

        long min = 0;

        for (int i = 1; i <= N; i++) {
            min += Math.abs(rankings[i - 1] - i);
        }
        System.out.println(min);
    }
}