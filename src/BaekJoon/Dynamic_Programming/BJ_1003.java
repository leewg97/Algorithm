package BaekJoon.Dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 함수
public class BJ_1003 {

    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        dp[0][0] = 1;	// N=0 일 때의 0 호출 횟수
        dp[0][1] = 0;	// N=0 일 때의 1 호출 횟수
        dp[1][0] = 0;	// N=1 일 때의 0 호출 횟수
        dp[1][1] = 1;	// N=1 일 때의 1 호출 횟수

        while (T --> 0) {
            int N = Integer.parseInt(br.readLine());
            Fibonacci(N);
            sb.append(dp[N][0]).append(" ").append(dp[N][1]).append('\n');
        }
        System.out.println(sb);
    }

    static Integer[] Fibonacci(int N) {
        // N에 대한 0, 1의 호출 횟수가 없을 떄(탐색하지 않은 값일 때)
        if (dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = Fibonacci(N - 1)[0] + Fibonacci(N - 2)[0];
            dp[N][1] = Fibonacci(N - 1)[1] + Fibonacci(N - 2)[1];
        }
        return dp[N];
    }
}
/*
* N=2 일 때, Fibonacci(2) = Fibonacci(1) + Fibonacci(0) 이므로 0과 1은 각각 1번씩 호출된다.
* N=3 일때는 Fibonacci(3) = Fibonacci(2) + Fibonacci(1)
* Fibonacci(3) = (Fibonacci(1) + Fibonacci(0)) + Fibonacci(1) 이므로 0은 1번, 1은 2번 호출된다.
*/