package Programmers.Level1.핸드폰_번호_가리기;

public class Solution {
    public String solution(String phone_number) {
        String substring = phone_number.substring(phone_number.length() - 4);
        return "*".repeat(phone_number.length() - substring.length()) + substring;
    }
}
