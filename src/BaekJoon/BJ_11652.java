package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 카드
public class BJ_11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        // idx = 최빈값, idxCount || 최빈값 = 등장 횟수 || currentCount = 현재 값의 등장 횟수
        int currentCount = 1, idxCount = 1, idx = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > idxCount) {
                idxCount = currentCount;
                idx = i;
            }
        }
        System.out.println(arr[idx]);
    }
}
