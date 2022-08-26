package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수 찾기
public class BJ_1920 {
    public static void main(String[] args) throws IOException {
        String inputData = """
        4
        120 110 140 150
        485
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int sum = 0;
        int left = 0;
        int right = 0;

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        int M = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        right = arr[N - 1]; // max

        while(left <= right) {
            int mid = (left + right) / 2;
            long budget =0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > mid) {
                    budget += mid;
                } else {
                    budget += arr[i];
                }
            }
            if (budget <= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
