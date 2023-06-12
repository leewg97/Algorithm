package BaekJoon.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 카드 1
public class BJ_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(' ');
            if (queue.isEmpty()) break;
            queue.offer(queue.poll());
        }

        System.out.println(sb);
    }
}
