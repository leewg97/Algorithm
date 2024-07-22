package Softeer.Safebreaker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new int[]{
                    Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())
            });
        }

        Collections.sort(list, (o1, o2) -> o2[1] - o1[1]);

        int answer = 0;

        for (int[] temp : list) {
            if (W <= temp[0]) {
                answer += W * temp[1];
                System.out.println(answer);
                break;
            } else {
                answer += temp[0] * temp[1];
                W -= temp[0];
                System.out.println("answer : " + answer + "\n W : " + W);
            }
        }

        System.out.println(answer);
    }

}
