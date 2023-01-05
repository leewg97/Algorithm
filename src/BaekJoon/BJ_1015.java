package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 수열 정렬
public class BJ_1015 {

    static class P {
        int idx;
        int value;

        public P(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<P> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(new P(i, Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list, (o1, o2) -> {
            if (o1.value < o2.value) {
                return -1;
            } else if (o1.value > o2.value) {
                return 1;
            } else {
                if (o1.idx < o2.idx) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        int[] arr = new int[1001];
        for (int i = 0; i < n; i++) {
            arr[list.get(i).idx] = i;
        }

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(' ');
        }

        System.out.println(sb);
    }
}
