package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 행렬 곱셈 순서
// 이해 조금만 더 하면 될듯?
public class BJ_11049 {
    public static void main(String[] args) throws IOException {

        String inputData = """
                3
                5 3
                3 2
                2 6
                """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] matrix = new int[N][2];
        int[][] dp = new int[N][N];
        int end;
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            matrix[i][0] = Integer.parseInt(st.nextToken());
            matrix[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            for (int start = 0; start < N - i; start++) {
                end = start + i;
                dp[start][end] = Integer.MAX_VALUE;
                for (int k = start; k < end; k++) {
                    dp[start][end] = Math.min(dp[start][end], dp[start][k] + dp[k + 1][end] + matrix[start][0] * matrix[k][1] * matrix[end][1]);
                }
            }
        }
        System.out.println(dp[0][N - 1]);
    }
}
