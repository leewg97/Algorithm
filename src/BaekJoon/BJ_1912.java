package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연속합
public class BJ_1912 {
    public static void main(String[] args) throws IOException {

        String inputData = """
        10
        2 1 -4 3 4 -4 6 5 -5 1
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = arr[0];
        int max = dp[0];
        for (int i = 1; i < N; i++) {   // 0은 처리가 이미 됐으니까 1부터 시작
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]); // 바로 직전까지의 최대 값 + 현재 자리의 값
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
/*풀지 못했으니 복기해보기*/