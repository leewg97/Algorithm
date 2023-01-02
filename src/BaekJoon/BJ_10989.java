package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 수 정렬하기 3
public class BJ_10989 {

    public static void main(String[] args) throws IOException {

        String inputData = """
        10
        5
        2
        3
        1
        4
        2
        3
        5
        1
        7
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int result : arr) {
            sb.append(result).append('\n');
        }

        System.out.println(sb);

    }
}
