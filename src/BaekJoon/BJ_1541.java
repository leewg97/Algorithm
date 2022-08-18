package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 잃어버린 괄호(+먼저 다 해준 뒤 -해주면 됌)
public class BJ_1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = 0;
        int subMaxMinus = 0;

        StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");
        StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");

        while (addition.hasMoreTokens()) {
            min += Integer.parseInt(addition.nextToken());
        }

        while (subtraction.hasMoreTokens()) {
            subMaxMinus = 0;
            addition = new StringTokenizer(subtraction.nextToken(), "+");
            while (addition.hasMoreTokens()) {
                subMaxMinus += Integer.parseInt(addition.nextToken());
            }
            min -= subMaxMinus;
        }
        System.out.println(min);
    }
}
