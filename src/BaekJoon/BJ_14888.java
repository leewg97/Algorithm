package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연산자 끼워넣기
public class BJ_14888 {

    public static int[] number;
    public static int[] operator = new int[4];
    public static int n;
    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        number = new int[n];

        // 숫자
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        // 연산자
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < operator.length; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        rec_func(number[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    public static void rec_func(int value, int k) {
        if (k == n) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            return;
        }

        for (int i = 0; i < 4; i++) {
            // 연산자 갯수 1개 이상
            if (operator[i] > 0) {
                // 연산자 갯수 1 감소
                operator[i]--;
                switch (i) {
                    case 0 : rec_func(value + number[k], k + 1); break;
                    case 1 : rec_func(value - number[k], k + 1); break;
                    case 2 : rec_func(value * number[k], k + 1); break;
                    case 3 : rec_func(value / number[k], k + 1); break;
                }
                operator[i]++;
            }
        }
    }
}
