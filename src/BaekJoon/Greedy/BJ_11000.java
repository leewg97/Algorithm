package BaekJoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 강의실 배정
public class BJ_11000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Clazz[] clazz = new Clazz[N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            clazz[i] = new Clazz();
            st = new StringTokenizer(br.readLine());
            clazz[i].s = Integer.parseInt(st.nextToken());
            clazz[i].e = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(clazz, Comparator.comparingInt(o -> o.s));

        Queue<Integer> queue = new PriorityQueue<>();
        int answer = 0;
        for (int i = 0; i < N; i++) {
            while (!queue.isEmpty() && queue.peek() <= clazz[i].s) {
                queue.poll();
            }
            queue.add(clazz[i].e);
            answer = Math.max(answer, queue.size());
        }
        System.out.println(answer);
    }

    public static class Clazz {
        int s;
        int e;
    }

}
