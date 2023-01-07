package BaekJoon.Sort;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 대표값2
public class BJ_2587 {

    public static void main(String[] args) throws IOException {

        String inputData = """
        10
        40
        30
        60
        30
        """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] += num;
            sum += num;
        }

        System.out.println(sum / 5);

        Arrays.sort(arr);

        System.out.println(arr[2]);

    }
}
