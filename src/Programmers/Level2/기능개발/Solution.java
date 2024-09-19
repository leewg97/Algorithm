package Programmers.Level2.기능개발;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) queue.offer((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));

        while (!queue.isEmpty()) {
            int now = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= now) {
                queue.poll();
                count++;
            }

            answer.add(count);
        }

        return answer.stream().mapToInt(value -> value).toArray();
    }
}
