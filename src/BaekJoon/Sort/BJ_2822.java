package BaekJoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// 점수 계산
public class BJ_2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[8][2];
        int[] answer = new int[5];

        for (int i = 0; i < 8; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = i + 1;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[0], o1[0]);
            }
        });

        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sum += arr[i][0];
            answer[i] = arr[i][1];
        }

        Arrays.sort(answer);

        System.out.println(sum);
        for (int i : answer) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);

    }
}
