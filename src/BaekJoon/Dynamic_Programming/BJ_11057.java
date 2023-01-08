package BaekJoon.Dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 오르막 수
public class BJ_11057 {

    static int N;
    static int[] A;
    static int[][] DP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        DP = new int[N + 1][10];

        DP();
    }

    public static void DP() {
        // 초기값 구하기
        for (int num = 0; num <= 9; num++) {
            DP[1][num] = 1;
        }

        // DP 배열 채우기
        for (int len = 2; len <= N; len++) {
            for (int num = 0; num <= 9; num++) {
                // DP[len][num] := ?
                for (int prev = 0; prev <= num; prev++) {
                    DP[len][num] += DP[len - 1][prev];
                    DP[len][num] %= 10007;
                }
            }
        }

        int answer = 0;
        for (int num = 0; num <= 9; num++) {
            answer += DP[N][num];
            answer %= 10007;
        }

        System.out.println(answer);
    }
}
