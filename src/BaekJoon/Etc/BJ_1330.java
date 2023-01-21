package BaekJoon.Etc;

import java.util.Scanner;

// 두 수 비교하기
public class BJ_1330 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        if(A > B){
            System.out.println(">");
        } else if (A < B){
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }

}
