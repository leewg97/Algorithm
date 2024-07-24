package Programmers.Level1.서울에서_김서방_찾기;

import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {

        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (!seoul[i].equals("Kim")) continue;
            index = i;
        }

        return String.format("김서방은 %d에 있다", index);
    }
}
