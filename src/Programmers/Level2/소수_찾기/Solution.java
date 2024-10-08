package Programmers.Level2.소수_찾기;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    // 소수 저장을 위한 SET 정의
    Set<Integer> primes = new HashSet<>();

    public int solution(String numbers) {
        // 주어진 숫자 조각으로 가능한 모든 소수를 찾기 위해 DFS를 실행
        dfs("", numbers);
        return primes.size();
    }

    // DFS
    private void dfs(String current, String remaining) {
        // 현재 만든 숫자가 있으면 소수인지 확인
        if (!current.isEmpty()) {
            int currentNum = Integer.parseInt(current);
            if (isPrime(currentNum)) primes.add(currentNum);
        }

        // 남은 숫자를 사용해 조합 만들기
        for (int i = 0; i < remaining.length(); i++) {
            // 현재 숫자에 남은 숫자를 추가하고, 나머지를 사용해 새로운 조합을 만들기
            System.out.printf("prev current : %s, current : %s, remaining : %s, subString remaining : %s \n",
                    current,
                    current + remaining.charAt(i),
                    remaining,
                    remaining.substring(0, i) + remaining.substring(i + 1));


            dfs(current + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }

    public boolean isPrime(int num) {
        if (num < 2) return false; // 2보다 작은 수는 소수가 아님

        // 2부터 num의 제곱근까지 나눠서 소수인지 판별
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // 나누어 떨어지면 소수가 아님
        }

        return true; // 나누어 떨어지지 않으면 소수
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("17");
    }
}
