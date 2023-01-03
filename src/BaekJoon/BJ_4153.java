package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 직각 삼각형
public class BJ_4153 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            if (x * x == (y * y + z * z)) {
                System.out.println("right");
            } else if (y * y == (x * x + z * z)) {
                System.out.println("right");
            } else if (z * z == (x * x + y * y)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
