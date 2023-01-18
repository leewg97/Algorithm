package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// Yonsei TOTO
public class BJ_12018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   // 과목 수
        int M = Integer.parseInt(st.nextToken());   // 주어진 마일리지
        int[] min = new int[N];                     // 과목을 얻기 위한 최소 마일리지 배열

        int count = 0;

        // 전체 과목 루프
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int P = Integer.parseInt(st.nextToken());   // 신청한 사람 수
            int L = Integer.parseInt(st.nextToken());   // 수강 인원
            Integer[] mileage = new Integer[P];         // 과목에 신청한 사람들의 마일리지를 담는 배열

            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < mileage.length; j++) {
                mileage[j] = Integer.parseInt(st.nextToken());
            }

            // 내림차순 정렬
            Arrays.sort(mileage, Collections.reverseOrder());

            if (L > P) {
                min[i] = 1;
            } else {
                min[i] = mileage[L - 1];    // 그 과목에 필요한 최소 마일리지
            }
        }

        // 최소 마일리지 배열 오름차순 정렬
        Arrays.sort(min);

        for (int i = 0; i < min.length; i++) {  // 최소 마일리지 배열에서 과목 수 구하기
            if (M >= min[i]) {
                M -= min[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
