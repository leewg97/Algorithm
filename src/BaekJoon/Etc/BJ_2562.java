package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최댓값
public class BJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int index = 0;
        int max = 0;
        int count = 0;

        for (int value : arr) {
            count++;
            if (value > max) {
                max = value;
                index = count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
