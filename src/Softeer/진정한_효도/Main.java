package Softeer.진정한_효도;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] land = new int[3][3];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                land[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int minCost = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int[] section = {land[i][0], land[i][1], land[i][2]};
            minCost = Math.min(minCost, calculate(section));
        }

        for (int i = 0; i < 3; i++) {
            int[] section = {land[0][i], land[1][i], land[2][i]};
            minCost = Math.min(minCost, calculate(section));
        }

        System.out.print(minCost);
    }

    public static int calculate(int[] arr) {
        Arrays.sort(arr);
        int median = arr[1];
        return Math.abs(arr[0] - median) + Math.abs(arr[2] - median);
    }
}
