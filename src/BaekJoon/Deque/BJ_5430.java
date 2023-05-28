package BaekJoon.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

// AC
public class BJ_5430 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            String str = in.readLine();
            int N = Integer.parseInt(in.readLine());

            Deque<Integer> deque = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(in.readLine(), "[|],");
            while (st.hasMoreTokens()) {
                deque.offer(Integer.parseInt(st.nextToken()));
            }

            boolean reverse = true;
            boolean error = false;
            for (int i = 0; i < str.length(); i++) {
                if (error) break;
                switch (str.charAt(i)) {
                    case 'R':
                        reverse = !reverse;
                        break;
                    case 'D':
                        if (deque.isEmpty()) error = true;
                        else if (reverse) deque.poll();
                        else deque.pollLast();
                        break;
                }
            }

            if (error) {
                sb.append("error").append('\n');
                continue;
            }

            sb.append("[");
            while (!deque.isEmpty()) {
                if (reverse) sb.append(deque.poll());
                else sb.append(deque.pollLast());
                if (deque.size() >= 1) sb.append(",");
            }
            sb.append("]").append('\n');

        }
        System.out.print(sb);
    }
}

