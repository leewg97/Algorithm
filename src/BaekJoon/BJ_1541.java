package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 잃어버린 괄호(+먼저 다 해준 뒤 -해주면 됌)
public class BJ_1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");
        while (subtraction.hasMoreTokens()) {
            int tmp = 0;

            // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            StringTokenizer add = new StringTokenizer(subtraction.nextToken(), "+");

            while (add.hasMoreTokens()) {   // 덧셈으로 나뉜 토큰들을 모두 더한다.
                tmp += Integer.parseInt(add.nextToken());
            }

            if (sum == 0) { // 첫 번째토큰인 경우 tmp값이 첫 번째 수가 됨
                sum += tmp;
            } else {
                sum -= tmp;
            }
        }
        System.out.println(sum);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int min = 0;
//        int subMaxMinus = 0;
//
//        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");
//        StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");
//
//        while (addition.hasMoreTokens()) {
//            min += Integer.parseInt(addition.nextToken());
//        }
//
//        while (subtraction.hasMoreTokens()) {
//            subMaxMinus = 0;
//            addition = new StringTokenizer(subtraction.nextToken(), "+");
//            while (addition.hasMoreTokens()) {
//                subMaxMinus += Integer.parseInt(addition.nextToken());
//            }
//            min -= subMaxMinus;
//        }
//        System.out.println(min);
    }
}
