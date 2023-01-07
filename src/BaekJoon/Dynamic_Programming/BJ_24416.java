package BaekJoon.Dynamic_Programming;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 1
public class BJ_24416 {

    static int count = 0;
    static int dpCount = 0;
    static int[] dp;
    public static void main(String[] args) throws IOException {

        String inputData = """
                30
                """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n];
        fib(n);
        fibonacci(n);
        System.out.println(count);
        System.out.println(dpCount);
    }

    public static int fib(int n) {

        if(n == 1 || n == 2){
            count++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static int fibonacci(int n) {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n; i++) {
            dpCount++;
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }

}
