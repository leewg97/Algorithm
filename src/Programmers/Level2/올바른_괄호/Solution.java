package Programmers.Level2.올바른_괄호;

import java.util.Stack;

public class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (!stack.peek().equals(c)) stack.pop();
            else stack.push(c);
        }

        return stack.isEmpty();
    }
}
