package Programmers.Level1.햄버거_만들기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int i : ingredient) {
            list.add(i);
            if (list.size() >= 4) {
                if (
                        list.get(list.size() - 4) == 1 &&
                        list.get(list.size() - 3) == 2 &&
                        list.get(list.size() - 2) == 3 &&
                        list.get(list.size() - 1) == 1
                ) {
                    answer++;
                    list.remove(list.size() - 4);
                    list.remove(list.size() - 3);
                    list.remove(list.size() - 2);
                    list.remove(list.size() - 1);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1});
        System.out.println(result);
    }
}
