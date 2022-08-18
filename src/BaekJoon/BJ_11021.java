package BaekJoon;

import java.util.Scanner;

public class BJ_11021 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int arr[] = new int[T];

        for(int i = 0; i < T; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
        }
        sc.close();

        int k = 1;

        for(int j : arr){
            System.out.println("Case #" + k + ": " + j);
            k++;
        }

    }
}
