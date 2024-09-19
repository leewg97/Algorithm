package Programmers.Level2.JadenCase_문자열_만들기;

public class Solution {
    public String solution(String s) {
        String[] arr = s.toLowerCase().split(" ", -1);  // split에서 -1을 넣어 연속된 공백도 포함하도록 설정

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String string = arr[i];

            if (!string.isEmpty()) {
                char firstChar = string.charAt(0);
                if (Character.isDigit(firstChar)) {
                    sb.append(string);
                } else {
                    sb.append(Character.toUpperCase(firstChar));
                    sb.append(string.substring(1));
                }
            }

            if (i != arr.length - 1) sb.append(" ");
        }

        return sb.toString();
    }
}

