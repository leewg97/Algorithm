package Programmers.Level2.타켓_넘버;

public class Solution {

    public static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    private void dfs(int[] numbers, int target, int index, int currentSum) {
        if (index == numbers.length) {
            if (target == currentSum) answer++;
            return;
        }

        dfs(numbers, target, index +1 , currentSum + numbers[index]);
        dfs(numbers, target, index +1 , currentSum - numbers[index]);
    }
}
