package BaekJoon.Dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2579 계단 오르기
public class BJ_2579 {

    static int N;
    static int[][] dp;
    static int[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        A = new int[N + 1];
        dp = new int[N + 1][2];

        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        dp();
    }

    private static void dp() {
        // 초기값
        dp[1][0] = 0;
        dp[1][1] = A[1];

        // 계단이 두개 보장이 되어있어야 함
        if (N >= 2) {
            dp[2][0] = A[2];
            dp[2][1] = A[1] + A[2];
        }

        // 점화식 토대로 배열 채우기
        for (int i = 3; i <= N; i++) {
            dp[i][0] = Math.max(dp[i - 2][0] + A[i], dp[i - 2][1] + A[i]);
            dp[i][1] = dp[i - 1][0] + A[i];
        }

        // 정답 계산
        int answer = Math.max(dp[N][0], dp[N][1]);

        System.out.println(answer);
    }
}
