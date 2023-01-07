package Programmers;

import java.util.Arrays;

// 구명 보트
public class Lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int index = 0;

        for (int i = people.length - 1; i >= index; i--) {
            if(people[i] + people[index] > limit) {
                answer++;
            } else {
                answer++;
                index++;
            }
        }
        return answer;
    }
}
