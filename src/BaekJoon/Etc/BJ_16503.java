package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 괄호 없는 사칙연산
public class BJ_16503 {

    public static int k1, k2, k3;
    public static char o1, o2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        k1 = Integer.parseInt(st.nextToken());
        o1 = st.nextToken().charAt(0);
        k2 = Integer.parseInt(st.nextToken());
        o2 = st.nextToken().charAt(0);
        k3 = Integer.parseInt(st.nextToken());

        int result1, result2 = 0;
        result1 = calc(calc(k1, o1, k2), o2, k3);
        result2 = calc(k1, o1, calc(k2, o2, k3));

        System.out.println(String.valueOf(Math.min(result1, result2)) + '\n' + Math.max(result1, result2));
    }

    public static int calc(int a, char o, int b) {
        int res = 0;
        switch (o) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
        }
        return res;
    }

}
