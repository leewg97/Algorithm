package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 30
public class BJ_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = br.readLine().toCharArray();

        Arrays.sort(c); // 오름차순 정렬

        int sum = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = c.length - 1; i >= 0; i--) {   // 오름차순 정렬이기에 마지막 인덱스 ~ 0까지 탐색
            int num = c[i] - '0';
            sum += num;
            sb.append(num);
        }

        if (c[0] != '0' || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sb);
    }
}
