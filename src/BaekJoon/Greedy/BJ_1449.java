package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수리공 항승
public class BJ_1449 {
    static int N, L, min, tape;
    static int[] location;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        location = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            location[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(location);
        tape = (int) (location[0] - 0.5 + L);
        min = 1;

        for (int i = 1; i < location.length; i++) {
            if (tape < (int) (location[i] + 0.5)) {
                tape = (int) (location[i] - 0.5 + L);
                min++;
            }
        }
        System.out.println(min);
    }
}
