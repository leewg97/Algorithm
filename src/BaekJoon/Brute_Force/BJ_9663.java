package BaekJoon.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// NQueen
public class BJ_9663 {

    public static int N;
    public static int[] arr; // 배열의 인덱스를 열, 원소 값을 행이라고 두고 품
    public static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        recFunc(0);
        System.out.println(count);
    }

    public static void recFunc(int k) {
        if (k == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[k] = i;
            // 놓을 수 있는 위치일 경우 재귀호출
            if (possible(k)) {
                recFunc(k + 1);
            }
        }
    }

    private static boolean possible(int column) {
        for (int i = 0; i < column; i++) {
            // 같은 행에 존재 할 경우
            if (arr[column] == arr[i]) {
                return false;
            }

            // 대각선 상에 놓여있는 경우
            // 열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우임
            else if (Math.abs(arr[column] - arr[i]) == Math.abs(column - i)) {
                return false;
            }
        }

        return true;
    }

}
