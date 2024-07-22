package Softeer.위험한_효도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int distance = d;
        int total = 0;

        while (distance > 0) {
            if (distance > a) {
                total += a;
                distance -= a;
            } else {
                total += distance;
                distance = 0;
            }

            if (distance > 0) total += b;
        }

        distance = d;
        while (distance > 0) {
            if (distance > b) {
                total += b;
                distance -= b;
            } else {
                total += distance;
                distance = 0;
            }
            if (distance > 0) total += a;
        }

        System.out.println(total);
    }
}
