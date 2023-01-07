package Softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 8단 변속기
public class Eight_Speed_Gearbox {

    public static int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
    public static int[] desc = {8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (check(asc, arr)) {
            System.out.println("ascending");
        } else if (check(desc, arr)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }

    public static boolean check(int[] arr1, int[] arr2) {
        for (int i = 0; i < 8; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
