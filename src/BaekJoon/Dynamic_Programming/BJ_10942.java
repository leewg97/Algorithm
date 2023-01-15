package BaekJoon.Dynamic_Programming;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 팰린드롬?
public class BJ_10942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int[][] dp = new int[N][N];
        int S, E, end;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            for (int start = 0; start < N - i; start++) {
                end = start + i;
                if (start == end) {
                    dp[start][end] = 1;
                } else if (nums[start] == nums[end]) {
                    if ((start + 1) == end) {
                        dp[start][end] = 1;
                    } else if (dp[start + 1][end - 1] == 1) {
                        dp[start][end] = 1;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            S = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());
            if (dp[S - 1][E - 1] == 1) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.println(sb);
    }
}
