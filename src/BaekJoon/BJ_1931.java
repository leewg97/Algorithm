package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 회의실 배정
public class BJ_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /*
          시작 시간 arr[][0]
          종료 시간 arr[][1]
        */
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());   // 시작 시간
            arr[i][1] = Integer.parseInt(st.nextToken());   // 종료 시간
        }

        // 끝나는 시간 기준 내림차순 정렬 compare 재정의
        Arrays.sort(arr, (o1, o2) -> {
            // 종료 시간이 같다면? 시작 시간순으로 정렬
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int cnt = 0;
        int prev = 0;   // 직전 종료 시간

        for (int i = 0; i < N; i++) {   // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if (prev <= arr[i][0]) {
                prev = arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
