package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 음계
public class BJ_2920 {

    public static int[] ASC = {1, 2, 3, 4, 5, 6, 7, 8};
    public static int[] DESC = {8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (Arrays.equals(arr, ASC)) {
            System.out.println("ascending");
        } else if (Arrays.equals(arr, DESC)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
