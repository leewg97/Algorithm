package BaekJoon;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// ATM
public class BJ_11399_1 {

     public static void main(String[] args) throws IOException {

        String inputData = """
               5
               3 1 4 3 2
               """;
        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] minutes = new int[N];
        for (int i = 0; i < N; i++) {
            minutes[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(minutes);
        int min = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                min += minutes[j];
            }
        }
         System.out.println(min);
     }
}
