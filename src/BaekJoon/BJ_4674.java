package BaekJoon;

// 셀프 넘버
public class BJ_4674 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for (int i = 0; i < check.length; i++) {
            int n = r(i);

            if (n < check.length) {
                check[n] = true;
            }
        }

        for (int i = 0; i < check.length; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    public static int r(int num) {
        int sum = num;

        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
