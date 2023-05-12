package BaekJoon.Dynamic_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평범한 배낭
public class BJ_12865 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 물건 당 첫 번째 열에는 물건의 무게를, 두 번째 열에는 물건의 가치를 저장한다.
        // 물건이 없는 경우도 고려하여 인덱스가 0인 경우를 추가해준다.
        int[][] weight_value = new int[N + 1][2];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            weight_value[i][0] = Integer.parseInt(st.nextToken());
            weight_value[i][1] = Integer.parseInt(st.nextToken());
        }

        // 먼저 i번째 물건의 j번째 무게에서 가질 수 있는 최댓값을 저장할 수 있는 2차원 dp 테이블을 정의한다.
        // 이때, 기저 조건을 위해 dp 테이블에 인덱스가 0인 경우를 추가해준다.
        int[][] dp = new int[N + 1][K + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                // 물건을 담을 수 없는 경우
                if (weight_value[i][0] > j) {
                    // i - 1번째 물건까지 고려했을때 무게 j 에서의 최대 가치(최적해)를 그대로 가져온다.
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // i - 1번째 물건까지 고려했을때 무게 j 에서의 최대 가치(최적해)와,
                    // i - 1번째 물건까지 고려했을때 무게 j - weight_value[i][0](현재 무게)의 최대 가치(최적해) + weight_value[i][1](현재 가치) 중에서
                    // 더 큰 값을 선택한다.
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight_value[i][0]] + weight_value[i][1]);
                }
            }
        }
        // N가지 물건을 모두 고려했을때 K 무게에서의 최대 가치를 출력
        System.out.println(dp[N][K]);
    }
}
