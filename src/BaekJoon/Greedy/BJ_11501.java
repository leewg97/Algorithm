package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 주식
public class BJ_11501 {
    /*
    * 인덱스를 앞이 아닌 맨 뒤에서 푼다.
    * max 값을 먼저 찾고, max 값이 arr[k] 보다 크다면 max를 arr[k]로 치환하고
    * max 값이 arr[k] 보다 작다면 sum에 (max - arr[k]) 값을 더해준다.
    * sum이 int일 때는 문제를 틀리게 되어 long으로 선언한다.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> list = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            int max = Integer.MIN_VALUE;
            long sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int k = arr.length - 1; k >= 0; k--) {
                if (max < arr[k]) {
                    max = arr[k];
                }
                if (max > arr[k]) {
                    sum += (max - arr[k]);
                }
            }
            list.add(sum);
        }

        for (long num : list) {
            System.out.println(num);
        }
    }
}
