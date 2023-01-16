package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 균형잡힌 세상
public class BJ_4949 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String st;

        while (true) {
            st = br.readLine();

            if (st.equals(".")) {
                break;
            }

            sb.append(st(st)).append('\n');
        }
        System.out.println(sb);
    }

    public static String st(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty() || stack.peek() != '(') { // 스택이 비어있거나 pop 할 원소가 소괄호랑 매칭이 안되는 경우
                    return "no";
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.empty() || stack.peek() != '[') { // 스택이 비어있거나 pop 할 원소가 대괄호랑 매칭이 안되는 경우
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }

}
