package BJ_11399;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// ATM
public class Main {

     public static void main(String[] args) throws IOException {

        String inputData = """
        5
        3 1 4 3 2
        """;
         System.setIn(new ByteArrayInputStream(inputData.getBytes()));

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         int N = Integer.parseInt(br.readLine());

         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

         int[] arr = new int[N];

         for (int i = 0; i < N; i++) {
             arr[i] = Integer.parseInt(st.nextToken());
         }

         Arrays.sort(arr);

         int prev = 0;
         int sum = 0;

         for (int i = 0; i < N; i++) {
             sum += prev + arr[i];

             prev += arr[i];
         }
         System.out.println(sum);
     }
}