package BJ_2012;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 등수 매기기
public class Main {

    public static void main(String[] args) throws IOException {

        String inputData = """
        5
        1
        5
        3
        1
        2
         """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] rankings = new int[N];

        for (int i = 0; i < N; i++) {
            rankings[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rankings);

        long min = 0;

        for (int i = 0; i < N; i++) {
            min += Math.abs((i + 1) - rankings[i]);
        }
        System.out.println(min);
    }
}