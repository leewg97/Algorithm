package BaekJoon;

import java.util.Scanner;

// 곱셈
public class BJ_2588 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String B = sc.next();

        sc.close();

        System.out.println(A*(B.charAt(2)));
        System.out.println(A*(B.charAt(1)));
        System.out.println(A*(B.charAt(0)));
        System.out.println(A*Integer.parseInt(B));


    }


}
