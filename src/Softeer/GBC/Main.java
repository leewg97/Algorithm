package Softeer.GBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// GBC
public class Main {

    public static int N, M;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[N][2];
        int[][] arr2 = new int[M][2];
        int result = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr1[i][0] = Integer.parseInt(st.nextToken());
            arr1[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            arr2[i][0] = Integer.parseInt(st.nextToken());
            arr2[i][1] = Integer.parseInt(st.nextToken());
        }

        int idx = 0;
        for (int i = 0; i < N; i++) {
            for (int j = idx; j < M; j++) {
                if (arr1[i][0] < arr2[j][0]) {
                    arr2[j][0] -= arr1[i][0];
                    if (arr2[j][1] - arr1[i][1] > 0) result = Math.max(result, arr2[j][1] - arr1[i][1]);
                    break;
                } else if (arr1[i][0] > arr2[j][0]) {
                    arr1[i][0] -= arr2[j][0];
                    if (arr2[j][1] - arr1[i][1] > 0) result = Math.max(result, arr2[j][1] - arr1[i][1]);
                    idx++;
                } else {
                    if (arr2[j][1] - arr1[i][1] > 0) result = Math.max(result, arr2[j][1] - arr1[i][1]);
                    idx++;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
