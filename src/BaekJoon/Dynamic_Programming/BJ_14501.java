package BaekJoon.Dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 퇴사
public class BJ_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[] T = new int[N];
        int[] P = new int[N];
        int[] dp = new int[N + 1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N - 1; i > -1; i--) {
            if ((T[i] + i) > N) {
                dp[i] = dp[i + 1];
            } else {
                dp[i] = Math.max(dp[i + 1], P[i] + dp[i + T[i]]);
            }
        }
        System.out.println(dp[0]);
    }
}
