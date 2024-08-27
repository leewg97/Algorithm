package Programmers.Level1.최대공약수와_최소공배수;

public class Solution {
    public int[] solution(int n, int m) {
        return new int[]{getGcd(n, m), (n * m) / getGcd(n, m)};
    }

    public int getGcd(int n1, int n2) {
        if (n1 > n2) {
            if (n1 % n2 == 0) return n2;
            else return getGcd(n2, n1 % n2);
        } else {
            if (n2 % n1 == 0) return n1;
            else return getGcd(n1, n2 % n1);
        }
    }

    // 최소 공배수 : (n * m) / 최대공약수
}
