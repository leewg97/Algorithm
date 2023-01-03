package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 통계학
public class BJ_2108 {

    public static void main(String[] args) throws IOException {

        String inputData = """
        5
        1
        3
        8
        -2
        2
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] += num;
            sum += num;
        }

        System.out.println(sum / N);

        Arrays.sort(arr);

        System.out.println(arr[(N - 1) / 2]);

        System.out.println(arr[N - 1] - arr[0]);
    }
}
