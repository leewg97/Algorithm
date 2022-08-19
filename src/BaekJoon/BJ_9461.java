package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 파도반 수열
public class BJ_9461 {
    public static void main(String[] args) throws IOException {

        String inputData = """
        2
        6
        12
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[101];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        for (int i = 0; i < T; i++) {
            System.out.println(dp[Integer.parseInt(br.readLine())]);
        }
    }
}
