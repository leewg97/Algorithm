package Programmers.Level1.붕대_감기;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0]; // 시전 시간
        int x = bandage[1]; // 초당 회복량
        int y = bandage[2]; // 추가 회복량


        int lastAttackTime = attacks[attacks.length - 1][0];

        Map<Integer, Integer> map = new HashMap<>();
        for (int[] attack : attacks) map.put(attack[0], attack[1]);

        int successCnt = 0;
        int currentHealth = health;
        for (int time = 1; time <= lastAttackTime; time++) {
            if (map.containsKey(time)) {
                currentHealth -= map.get(time);
                successCnt = 0;
            } else {
                currentHealth += x;
                successCnt++;

                if (successCnt == t) {
                    currentHealth += y;
                    successCnt = 0;
                }

                if (currentHealth > health) currentHealth = health;
            }
            if (currentHealth < 1) return -1;
        }

        return currentHealth;
    }
}
