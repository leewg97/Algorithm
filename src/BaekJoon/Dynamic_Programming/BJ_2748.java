package BaekJoon.Dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 2
public class BJ_2748 {

    static int N;
    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new long[N + 1];

        for (int i = 0; i <= N; i++) {
            dp[i] = -1;
        }

        dp[0] = 0;
        dp[1] = 1;
        System.out.println(fib(N));
    }

    public static long fib(int N) {
        if (dp[N] == -1) {
            dp[N] = fib(N - 1) + fib(N - 2);
        }
        return dp[N];
    }
}