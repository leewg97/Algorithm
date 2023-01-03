package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주유소
public class BJ_13305_1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] dist = new long[N - 1]; // 도로의 길이
        long[] cost = new long[N]; // 리터당 가격

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N - 1; i++) {   // 도로의 길이
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {   // 리터당 가격 입력
            cost[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minCost = cost[0]; // 이전 까지의 과정 중 주유 최소 비

        // 현재 주유소의 기름 값이 이전 주유소 보다 쌀 경우 minCost 갱신
        for (int i = 0; i < N - 1; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
            }
            sum += (minCost * dist[i]);
        }
        System.out.println(sum);
    }
}
