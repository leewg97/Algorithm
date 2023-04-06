package BaekJoon.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 덱
public class BJ_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> deque = new LinkedList<>();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push_front" : deque.offerFirst(Integer.parseInt(st.nextToken())); break;
                case "push_back" : deque.offerLast(Integer.parseInt(st.nextToken())); break;
                case "pop_front" :
                    Integer pop_front = deque.pollFirst();
                    if (pop_front == null) {
                        sb.append(-1).append('\n');
                    } else sb.append(pop_front).append('\n'); break;
                case "pop_back" :
                    Integer pop_back = deque.pollLast();
                    if (pop_back == null) {
                        sb.append(-1).append('\n');
                    } else sb.append(pop_back).append('\n'); break;
                case "empty":
                    if (deque.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n'); break;

                case "size":
                    sb.append(deque.size()).append('\n'); break;

                case "front":
                    Integer front = deque.peek();
                    if (front == null) sb.append(-1).append('\n');
                    else sb.append(front).append('\n'); break;

                case "back":
                    Integer back = deque.peekLast();
                    if (back == null) sb.append(-1).append('\n');
                    else sb.append(back).append('\n'); break;
            }
        }
        System.out.println(sb);
    }
}
