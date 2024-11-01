package Softeer.Level2.나무_공격;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int[][] arr = new int[width + 1][length];

        for (int i = 1; i <= width; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] range = new int[2][2];
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                range[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 0; k < 2; k++) {
            for (int i = range[k][0]; i <= range[k][1]; i++) {
                for (int j = 0; j < length; j++) {
                    if (arr[i][j] == 1) {
                        arr[i][j] = 0;
                        break;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[i][j] == 0) continue;
                count++;
            }
        }

        System.out.print(count);
    }
}
