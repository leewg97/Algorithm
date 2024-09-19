package Programmers.Level1.같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        IntStream.range(0, arr.length).forEach(i -> {
            if (stack.empty() || !stack.peek().equals(arr[i])) stack.push(arr[i]);
        });
        return stack.stream().mapToInt(v -> v).toArray();
    }
}
