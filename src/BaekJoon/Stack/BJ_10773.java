package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 제로
public class BJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            if (K == 0) stack.pop();
            else stack.push(K);
        }

        for (int s : stack) {
            sum += s;
        }

        System.out.println(sum);
    }
}
