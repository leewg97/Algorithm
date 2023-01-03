package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 거스름돈
public class BJ_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());
        int[] arr = {500, 100, 50, 10, 5, 1};

        cost = 1000 - cost;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += cost / arr[i];
            cost = cost % arr[i];
        }

        System.out.println(sum);
    }
}
