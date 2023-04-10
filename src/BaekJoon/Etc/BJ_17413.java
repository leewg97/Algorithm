package BaekJoon.Etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// 단어 뒤집기 2
public class BJ_17413 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();     // LIFO 기능을 이용하기 위한 자료구조 Stack
        boolean check = false;  // 열린 꺽새와 닫힌 꺽새를 판별하기 위한 check

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') { // 열린 꺽새를 만났을 경우, stack 이 비어있지 않다면 모든 원소를 꺼내고 check 를 true
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                check = true;
            } else if (str.charAt(i) == '>') { // 닫힌 꺽새를 만났을 경우, check 를 false 로 입력 후 '>'저장
                check = false;
                sb.append(str.charAt(i));
                continue;
            }

            if (check) { // check 가 true 일 경우, '>'를 만나기 전까지 그대로 입력
                sb.append(str.charAt(i));
            } else { // check 가 false 일 경우, 괄호 이외의 문자를 처리
                if (str.charAt(i) == ' ') { // 해당 인덱스의 i번째 문자가 공백일 경우, 모든 원소를 POP 수행 후 공백 추가
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    stack.push(str.charAt(i));
                }
            }

            if (i == str.length() - 1) {    // 반복문이 마지막 횟수일 때, 스택이 비어있지 않다면 원소 추가
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }
        System.out.println(sb);
    }
}
