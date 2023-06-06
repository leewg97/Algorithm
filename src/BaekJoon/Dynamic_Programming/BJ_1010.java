package BaekJoon.Dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 다리 놓기
public class BJ_1010 {

    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(recur(M, N)).append('\n');
        }
        System.out.println(sb);
    }

    static int recur(int m, int n) {
        if (dp[m][n] > 0) return dp[m][n];
        if (m == n || n == 0) return dp[m][n] = 1;
        return dp[m][n] = recur(m - 1, n) + recur(m - 1, n - 1);
    }

}
