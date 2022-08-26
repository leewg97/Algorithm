package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 파일 합치기
public class BJ_11066 {
    public static void main(String[] args) throws IOException {

        String inputData = """
        2
        4
        40 30 30 50
        15
        1 21 3 4 5 35 5 4 3 5 98 21 14 17 32
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int end;
        for (int i = 0; i < T; i++) {
            int K = Integer.parseInt(br.readLine());
            int[] pages = new int[K];
            int[][] dp = new int[K][K];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                pages[j] = Integer.parseInt(st.nextToken());
            }
            int[] pageSum = new int[K + 1];
            for (int j = 0; j <= K; j++) {
                for (int k = 0; k < j; k++) {
                    pageSum[j] += pages[k];
                }
            }

            for (int j = 1; j < K; j++) {
                for (int start = 0; start < K - j; start++) {
                    end = start + j;
                    dp[start][end] = Integer.MAX_VALUE;
                    for (int k = start; k < end; k++) {
                        dp[start][end] = Math.min(dp[start][end], dp[start][k] + dp[k + 1][end] + (pageSum[end + 1] - pageSum[start]));
                    }
                }
            }
            System.out.println(dp[0][K - 1]);
        }
    }
}
