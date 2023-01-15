package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이항 계수 1
public class BJ_11050 {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        dp = new int[n + 1][k + 1];
        System.out.println(dynamic(n,k));
    }

    static int dynamic(int n, int k) {
        if (dp[n][k] > 0) return dp[n][k];
        if (k == 0 || n == k) return dp[n][k] = 1;
        return dp[n][k] = dynamic(n - 1, k - 1) + dynamic(n - 1, k);
    }
}
